package com.ivorossi.FoldingCalculator.controller;
import com.ivorossi.FoldingCalculator.model.PriceBlackVeener;
import com.ivorossi.FoldingCalculator.model.PriceGalvanizeVeener;
import com.ivorossi.FoldingCalculator.service.PanelAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/admin")
public class PanelAdminController {

    @Autowired
    PanelAdminService panelAdminService;

    @GetMapping
    public List<PriceBlackVeener> getAllBlackVeener(){
        return panelAdminService.findAllBlackVeener();
    }

    @PutMapping
    public PriceBlackVeener updateBlackVeener(@RequestBody PriceBlackVeener priceBlackVeener){
        return panelAdminService.updateBlackVeener(priceBlackVeener);
    }

    @GetMapping
    public List<PriceGalvanizeVeener> getAllGalvanizedVeener(){
        return panelAdminService.findAllGalvanizedVeener();
    }

    @PutMapping
    public PriceGalvanizeVeener updateGalvanizedVeener (@RequestBody PriceGalvanizeVeener priceGalvanizeVeener){
        return panelAdminService.updateGalvanizedVeener(priceGalvanizeVeener);
    }
}
