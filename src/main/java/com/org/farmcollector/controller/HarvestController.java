package com.org.farmcollector.controller;

import com.org.farmcollector.dto.HarvestDto;
import com.org.farmcollector.service.HarvestRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HarvestController {

    @Autowired
    HarvestRecordService harvestRecordService;

    @PostMapping("/harvest")
    String recordHarvestDetails(
            @RequestBody HarvestDto harvestDto){
        return harvestRecordService.recordHarvestDetails(harvestDto)
                .getCropType()
                .name();
    }

}
