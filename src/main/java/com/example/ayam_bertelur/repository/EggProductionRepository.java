package com.example.ayam_bertelur.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ayam_bertelur.models.EggProduction;

public interface EggProductionRepository extends JpaRepository<EggProduction, Long>{
    
}
