package com.example.ayam_bertelur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ayam_bertelur.dto.request.AddOrEditEggProductionDto;
import com.example.ayam_bertelur.dto.response.EggProductionDetailResponseDto;
import com.example.ayam_bertelur.dto.response.EggProductionListResponseDto;
import com.example.ayam_bertelur.dto.response.MessageResponse;
import com.example.ayam_bertelur.service.EggProductionService;

@RestController
@RequestMapping("api/production")
public class EggProductionController {
    
    @Autowired
    private EggProductionService eggProductionService;

    @GetMapping("/egg-productions")
    public ResponseEntity<EggProductionListResponseDto> getAllEggProduction(){
        return eggProductionService.getAllEggProduction();
    }

    @GetMapping("/egg-productions/{eggProductionId}")
    public ResponseEntity<EggProductionDetailResponseDto> getEggProductionById(@PathVariable Long eggProductionId ){
        return eggProductionService.getEggProductionDetail(eggProductionId);
    }

    @PostMapping("/egg-productions")
    public ResponseEntity<MessageResponse> addEggProduction(@RequestBody AddOrEditEggProductionDto addEggProductionDto){
        return eggProductionService.addEggProduction(addEggProductionDto);
    }

    @PutMapping("/egg-productions/{eggProductionId}")
    public ResponseEntity<MessageResponse> editEggProduction(@RequestBody AddOrEditEggProductionDto editEggProductionDto, @PathVariable Long eggProductionId){
        return eggProductionService.editEggProduction(editEggProductionDto, eggProductionId);
    }

    @DeleteMapping("/egg-productions/{eggProductionId}/delete")
    public ResponseEntity<MessageResponse> deleteEggProduction(@PathVariable Long eggProductionId){
        return eggProductionService.deleteProductionEgg(eggProductionId);
    }
}
