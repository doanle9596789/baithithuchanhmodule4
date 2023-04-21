package com.example.baithithuchanhmd4.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nation;
    private Double acreage;
    private Long population;
    private Double jdp;
    private String description;

    public City() {
    }

    public City(Long id, String name, String nation, Double acreage, Long population, Double jdp, String description) {
        this.id = id;
        this.name = name;
        this.nation = nation;
        this.acreage = acreage;
        this.population = population;
        this.jdp = jdp;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Double getAcreage() {
        return acreage;
    }

    public void setAcreage(Double acreage) {
        this.acreage = acreage;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Double getJdp() {
        return jdp;
    }

    public void setJdp(Double jdp) {
        this.jdp = jdp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
