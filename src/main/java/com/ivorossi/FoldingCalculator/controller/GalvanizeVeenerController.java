package com.ivorossi.FoldingCalculator.controller;

import com.ivorossi.FoldingCalculator.dto.BlackVeenerDTO;
import com.ivorossi.FoldingCalculator.dto.GalvanizeVeenerDTO;
import com.ivorossi.FoldingCalculator.service.GalvanizeVeenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/galvanized")
public class GalvanizeVeenerController {

    @Autowired
    GalvanizeVeenerService galvanizeVeenerService;

    @PostMapping
    public float galvanizeVennerCalculator(@RequestBody GalvanizeVeenerDTO galvanizeVeenerDTO){
        return galvanizeVeenerService.galvanizeVeenerPriceCalculator(galvanizeVeenerDTO);
    }
}
