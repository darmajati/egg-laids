package com.example.ayam_bertelur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ayam_bertelur.dto.response.RevenueResponseDto;
import com.example.ayam_bertelur.service.RevenueService;

@RestController
@RequestMapping("/api/revenue")
public class TotalRevenueController {

    @Autowired
    private RevenueService revenService;

    @GetMapping("/total-revenue")
    public ResponseEntity<RevenueResponseDto> calculateTotalRevenue(){
        return revenService.calculateTotalRevenue();
    }
}
