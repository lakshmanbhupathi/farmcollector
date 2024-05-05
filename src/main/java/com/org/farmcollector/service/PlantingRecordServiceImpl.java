package com.org.farmcollector.service;

import com.org.farmcollector.dao.CropRepository;
import com.org.farmcollector.dto.PlantingDto;
import com.org.farmcollector.entity.Crop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantingRecordServiceImpl implements PlantingRecordService{

    @Autowired
    CropRepository cropRepository;

    @Override
    public Crop recordPlantingDetails(PlantingDto plantingDto) {
        Crop crop = new Crop();
        crop.setCropType(plantingDto.cropType());
        crop.setPlantedArea(plantingDto.plantedArea());
        crop.setExpectedYield(plantingDto.expectedYield());
        crop.setFarmName(plantingDto.farmName());
        crop.setSeason(plantingDto.season());

        return cropRepository.save(crop);
    }
}
