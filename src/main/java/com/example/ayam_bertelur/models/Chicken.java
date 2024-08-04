package com.example.ayam_bertelur.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "chicken")
@Entity
public class Chicken {
    @Id
    @Column(name = "chicken_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long chickenId;

    @Column(name = "chicken_name")
    private String chickenName;

    @Column(name = "date")
    private LocalDate date;

    @OneToMany(mappedBy = "chicken")
    private List<EggProduction>eggProduction;
}
