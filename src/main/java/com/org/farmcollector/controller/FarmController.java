package com.org.farmcollector.controller;

import com.org.farmcollector.dto.FarmRecord;
import com.org.farmcollector.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/farm")
public class FarmController {

    @Autowired
    FarmService farmService;

    @PostMapping("/add")
    String createFarm(@RequestBody FarmRecord farmRecord){
        return farmService.createNewFarm(farmRecord.farmName(), farmRecord.address())
                .getFarmName();
    }
}
