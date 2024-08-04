package com.example.ayam_bertelur.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EggProduction {
    @Id
    @Column(name="egg_production_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long eggProductionId;

    @Column(name="egg_laids")
    private int eggLaids;

    @Column(name="date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "chicken_id")
    private Chicken chicken;
}
