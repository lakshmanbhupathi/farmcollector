package com.org.farmcollector.dto;


import com.org.farmcollector.enums.CropType;

public record HarvestDto(String farmName,
                         String season,
                         CropType cropType,
                         int actualYield) {
}
