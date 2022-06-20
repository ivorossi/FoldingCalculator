package com.ivorossi.FoldingCalculator.service;

import com.ivorossi.FoldingCalculator.model.PriceBlackVeener;
import com.ivorossi.FoldingCalculator.model.PriceGalvanizeVeener;
import com.ivorossi.FoldingCalculator.repository.PriceBlackVeenerRepository;
import com.ivorossi.FoldingCalculator.repository.PriceGalvanizeVeenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanelAdminService {
    @Autowired
    PriceGalvanizeVeenerRepository priceGalvanizeVennerRepository;
    @Autowired
    PriceBlackVeenerRepository priceBlackVeenerRepository;

    public List <PriceBlackVeener> findAllBlackVeener(){
        return priceBlackVeenerRepository.findAll();
    }
    public PriceBlackVeener updateBlackVeener(PriceBlackVeener priceBlackVeener){
        return  priceBlackVeenerRepository.save(priceBlackVeener);
    }

    public List <PriceGalvanizeVeener> findAllGalvanizedVeener(){
        return priceGalvanizeVennerRepository.findAll();
    }
    public PriceGalvanizeVeener updateGalvanizedVeener(PriceGalvanizeVeener priceGalvanizeVeener){
        return  priceGalvanizeVennerRepository.save(priceGalvanizeVeener);
    }

}
