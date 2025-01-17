package com.example.ayam_bertelur.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EggProductionListResponseDto {
    private List<EggProductionListResponse> eggProductionList;
}
