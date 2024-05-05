package com.org.farmcollector.controller;

import com.org.farmcollector.dao.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CropsController {
    @Autowired
    private CropRepository cropRepository;

    @RequestMapping("/crops")
    private String listAllCrops(Model model){
        model.addAttribute("crops", cropRepository.findAll());
        return "crops";
    }

}
