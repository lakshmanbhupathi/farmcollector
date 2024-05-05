package com.org.farmcollector.dto;

import com.org.farmcollector.enums.CropType;

public record PlantingDto(String farmName,
                          String season,
                          CropType cropType,
                          int plantedArea,
                          int expectedYield) {
}
