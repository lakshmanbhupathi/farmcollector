package com.org.farmcollector.service;

import com.org.farmcollector.dto.HarvestDto;
import com.org.farmcollector.entity.Crop;

public interface HarvestRecordService {
    Crop recordHarvestDetails(HarvestDto harvestDto);
}
