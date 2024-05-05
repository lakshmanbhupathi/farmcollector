package com.org.farmcollector.controller;


import com.org.farmcollector.dto.PlantingDto;
import com.org.farmcollector.service.PlantingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PlantedController {

    @Autowired
    PlantingRecordService plantingRecordService;

    @PostMapping("/planted")
    Long planted(@RequestBody PlantingDto plantingDto){
        return plantingRecordService.recordPlantingDetails(plantingDto).getId();
    }
}
