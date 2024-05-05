package com.org.farmcollector.dto;


import com.org.farmcollector.enums.CropType;

public record HarvestDto(String farmName,
                         CropType cropType,
                         int actualYield) {
}
