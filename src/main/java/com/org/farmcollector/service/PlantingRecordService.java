package com.org.farmcollector.service;

import com.org.farmcollector.dto.PlantingDto;
import com.org.farmcollector.entity.Crop;

public interface PlantingRecordService {
    Crop recordPlantingDetails(PlantingDto plantingDto);
}
