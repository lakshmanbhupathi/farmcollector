package com.org.farmcollector.service;

import com.org.farmcollector.dao.CropRepository;
import com.org.farmcollector.entity.Crop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CropServiceImpl implements CropsService {

    @Autowired
    CropRepository cropRepository;

    @Override
    public List<Crop> listAllCrops(){
        return cropRepository.findAll();
    }

}
