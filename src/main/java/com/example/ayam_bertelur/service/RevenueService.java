package com.example.ayam_bertelur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.ayam_bertelur.dto.response.RevenueResponseDto;
import com.example.ayam_bertelur.models.EggProduction;
import com.example.ayam_bertelur.repository.EggProductionRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RevenueService {
    
    @Autowired
    private EggProductionRepository eggProductionRepository;

    public ResponseEntity<RevenueResponseDto> calculateTotalRevenue(){
        try {
            double totalRevenue = 0;
            int totalEggLaids = 0;
    
            List<EggProduction> eggProductions = eggProductionRepository.findAll();
            for(EggProduction production : eggProductions) {
                totalEggLaids += production.getEggsLaid();
                totalRevenue += production.getEggsLaid() * production.getPrice();
            }
    
            RevenueResponseDto responseDto = RevenueResponseDto.builder()
                    .totalEggLaids(totalEggLaids)
                    .totalRevenue(totalRevenue)
                    .build();
    
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error occurred while calculating total revenue", e);

            RevenueResponseDto responseDto = RevenueResponseDto.builder()
                    .totalEggLaids(0)
                    .totalRevenue(0)
                    .build();

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseDto);
        }
       
    }
}
