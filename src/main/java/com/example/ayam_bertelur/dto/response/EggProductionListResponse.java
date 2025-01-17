package com.example.ayam_bertelur.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EggProductionListResponse {
    private long eggProductionId;
    private int eggLaids;
    private double price;
}
