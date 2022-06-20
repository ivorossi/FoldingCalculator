package com.ivorossi.FoldingCalculator.controller;
import com.ivorossi.FoldingCalculator.model.PriceBlackVeener;
import com.ivorossi.FoldingCalculator.model.PriceGalvanizedVeener;
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

    @GetMapping("/prices/black-veener")
    public List<PriceBlackVeener> getAllBlackVeener(){
        return panelAdminService.findAllBlackVeener();
    }

    @PutMapping("/prices/black-veener")
    public void updateBlackVeener(@RequestBody PriceBlackVeener priceBlackVeener){
         panelAdminService.updateBlackVeener(priceBlackVeener);
    }

    @GetMapping("/prices/galvanized-veener")
    public List<PriceGalvanizedVeener> getAllGalvanizedVeener(){
        return panelAdminService.findAllGalvanizedVeener();
    }

    @PutMapping("/prices/galvanized-veener")
    public void updateGalvanizedVeener (@RequestBody PriceGalvanizedVeener priceGalvanizedVeener){
         panelAdminService.updateGalvanizedVeener(priceGalvanizedVeener);
    }
}
