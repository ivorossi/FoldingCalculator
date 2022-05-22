package com.ivorossi.FoldingCalculator.controller;

import com.ivorossi.FoldingCalculator.dto.BlackVeenerDTO;
import com.ivorossi.FoldingCalculator.service.BlackVeenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/black")
public class BlackVeenerController {
    @Autowired
    BlackVeenerService blackVeenerService;

    @PostMapping
    // @PreAuthorize("hasAuthority('STANDARD')")
    public float blackVeenerPriceCalculator(@RequestBody BlackVeenerDTO blackVeenerDTO){
        return this.blackVeenerService.blackVeenerPriceCalculator(blackVeenerDTO);
    }

}
