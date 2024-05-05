package com.org.farmcollector.service;

import com.org.farmcollector.dao.FarmRepository;
import com.org.farmcollector.entity.Farm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmServiceImpl  implements FarmService{

    @Autowired
    FarmRepository farmRepository;

    @Override
    public Farm createNewFarm(String farmName, String address){

        Farm farm = new Farm();
        farm.setFarmName(farmName);
        farm.setAddress(address);
        return farmRepository.save(farm);
    }

}
