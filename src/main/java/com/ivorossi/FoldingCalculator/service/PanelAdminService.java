package com.ivorossi.FoldingCalculator.service;

import com.ivorossi.FoldingCalculator.dto.GalvanizedPriceUpdateDTO;
import com.ivorossi.FoldingCalculator.model.PriceBlackVeener;
import com.ivorossi.FoldingCalculator.model.PriceGalvanizedVeener;
import com.ivorossi.FoldingCalculator.repository.PriceBlackVeenerRepository;
import com.ivorossi.FoldingCalculator.repository.PriceGalvanizedVeenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanelAdminService {

    @Autowired
    PriceGalvanizedVeenerRepository priceGalvanizeVennerRepository;

    @Autowired
    PriceBlackVeenerRepository priceBlackVeenerRepository;

    public List<PriceBlackVeener> findAllBlackVeener() {
        return priceBlackVeenerRepository.findAll();
    }

    public PriceBlackVeener updateBlackVeener(PriceBlackVeener priceBlackVeener) {
        return priceBlackVeenerRepository.save(priceBlackVeener);
    }

    public List<PriceGalvanizedVeener> findAllGalvanizedVeener() {
        return priceGalvanizeVennerRepository.findAll();
    }

    public List<PriceGalvanizedVeener> updateGalvanizedVeener(
            GalvanizedPriceUpdateDTO galvanizedPriceUpdateDTO) {

        PriceGalvanizedVeener priceGalvanizeVeener = priceGalvanizeVennerRepository.findByTypeVeener(
                galvanizedPriceUpdateDTO.getTypeVeener()
        );
        priceGalvanizeVeener.setPrice(galvanizedPriceUpdateDTO.getPrice());
        priceGalvanizeVennerRepository.save(priceGalvanizeVeener);

        return priceGalvanizeVennerRepository.findAll();
    }

}
