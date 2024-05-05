package com.org.farmcollector.entity;

import com.org.farmcollector.enums.CropType;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "crop")
public class Crop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private CropType cropType;
    @Column
    private int plantedArea;

    @Column
    private int expectedYield;
    @Column
    @Nullable
    private int actualYield;


    public Crop() {
    }

    public Crop(Long id, CropType cropType, int plantedArea, int expectedYield, int actualYield) {
        this.id = id;
        this.cropType = cropType;
        this.plantedArea = plantedArea;
        this.expectedYield = expectedYield;
        this.actualYield = actualYield;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CropType getCropType() {
        return cropType;
    }

    public void setCropType(CropType cropType) {
        this.cropType = cropType;
    }

    public int getPlantedArea() {
        return plantedArea;
    }

    public void setPlantedArea(int plantedArea) {
        this.plantedArea = plantedArea;
    }

    public int getExpectedYield() {
        return expectedYield;
    }

    public void setExpectedYield(int expectedYield) {
        this.expectedYield = expectedYield;
    }

    public int getActualYield() {
        return actualYield;
    }

    public void setActualYield(int actualYield) {
        this.actualYield = actualYield;
    }
}
