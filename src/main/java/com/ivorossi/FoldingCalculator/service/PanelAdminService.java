package com.ivorossi.FoldingCalculator.service;

import com.ivorossi.FoldingCalculator.model.PriceBlackVeener;
import com.ivorossi.FoldingCalculator.model.PriceGalvanizedVeener;
import com.ivorossi.FoldingCalculator.repository.PriceBlackVeenerRepository;
import com.ivorossi.FoldingCalculator.repository.PriceGalvanizedVeenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class PanelAdminService {
    PriceBlackVeener priceBlackVeener;

    @Autowired
    PriceGalvanizedVeenerRepository priceGalvanizeVennerRepository;

    @Autowired
    PriceBlackVeenerRepository priceBlackVeenerRepository;

    public List<PriceBlackVeener> findAllBlackVeener() {
        List<PriceBlackVeener> priceBlackVeenerList = priceBlackVeenerRepository.findAll();
        priceBlackVeenerList.sort(Comparator.comparing(PriceBlackVeener::getId));
        return priceBlackVeenerList;
    }

    public void updateBlackVeener(PriceBlackVeener priceBlackVeener) {

         priceBlackVeenerRepository.save(priceBlackVeener);
    }

    public List<PriceGalvanizedVeener> findAllGalvanizedVeener() {
        List<PriceGalvanizedVeener> priceGalvanizedVeenerList = priceGalvanizeVennerRepository.findAll();
        priceGalvanizedVeenerList.sort(Comparator.comparing(PriceGalvanizedVeener::getId));
        return priceGalvanizedVeenerList;
    }

    public void updateGalvanizedVeener( PriceGalvanizedVeener priceGalvanizeVeener) {

         priceGalvanizeVennerRepository.save(priceGalvanizeVeener);

    }

}
