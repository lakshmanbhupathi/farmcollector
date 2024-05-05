package com.org.farmcollector.dao;

import com.org.farmcollector.entity.Crop;
import com.org.farmcollector.enums.CropType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CropRepository extends JpaRepository<Crop,Long> {

    List<Crop> findByFarmNameAndSeasonAndCropType(String farmName, String season, CropType cropType);

}
