package com.example.ayam_bertelur.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddOrEditEggProductionDto {
    private int eggLaids;
    private double price;
}
