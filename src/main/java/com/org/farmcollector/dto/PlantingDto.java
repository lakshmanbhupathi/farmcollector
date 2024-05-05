package com.org.farmcollector.dto;

import com.org.farmcollector.enums.CropType;

public record PlantingDto(String farmName,
                          CropType cropType,
                          int plantedArea,
                          int expectedYield) {
}
