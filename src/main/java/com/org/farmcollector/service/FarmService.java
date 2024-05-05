package com.org.farmcollector.service;

import com.org.farmcollector.entity.Farm;

public interface FarmService {
    Farm createNewFarm(String farmName, String address);
}
