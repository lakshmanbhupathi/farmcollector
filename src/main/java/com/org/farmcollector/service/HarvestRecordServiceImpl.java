package com.org.farmcollector.service;

import com.org.farmcollector.dao.CropRepository;
import com.org.farmcollector.dto.HarvestDto;
import com.org.farmcollector.entity.Crop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HarvestRecordServiceImpl implements HarvestRecordService {

    @Autowired
    CropRepository cropRepository;

    @Override
    public Crop recordHarvestDetails(HarvestDto dto) {
        List<Crop> crops =
                cropRepository.findByFarmNameAndSeasonAndCropType(dto.farmName(),
                    dto.season(),
                    dto.cropType());

        if(crops.isEmpty()){
            // TODO handle exception
            throw new NullPointerException();
        }

        if(crops.size() > 1){
            //TODO handle exception
            throw new NullPointerException("More than 1");
        }

        Crop crop = crops.get(0);
        crop.setActualYield(dto.actualYield());
        cropRepository.save(crop);

        return crop;
    }
}
