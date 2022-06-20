package com.ivorossi.FoldingCalculator.service;

import com.ivorossi.FoldingCalculator.dto.GalvanizeVeenerDTO;
import com.ivorossi.FoldingCalculator.model.PriceGalvanizedVeener;
import com.ivorossi.FoldingCalculator.repository.PriceGalvanizedVeenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GalvanizeVeenerService {

    @Autowired
    PriceGalvanizedVeenerRepository priceGalvanizeVennerRepository;

    private float numbersOfCutsAndPreviusPrice(int devolping) {
        if (1220 < devolping) {
            return Math.floorDiv(2440, devolping) * 1.22F;
        } else {
            return Math.floorDiv(1220, devolping) * 2.44F;
        }
    }

    private float pricePerMeter(GalvanizeVeenerDTO galvanizeVeenerDTO) {
        PriceGalvanizedVeener priceGalvanizeVeener = priceGalvanizeVennerRepository
                .findByTypeVeener(galvanizeVeenerDTO.getTypeVeener());
        if (galvanizeVeenerDTO.getDeveloping() > 610 && galvanizeVeenerDTO.getDeveloping() < 815) {
            return (priceGalvanizeVeener.getPrice() /
                    numbersOfCutsAndPreviusPrice(galvanizeVeenerDTO.getDeveloping())) * 0.68F;
        } else if (galvanizeVeenerDTO.getDeveloping() > 1220 && galvanizeVeenerDTO.getDeveloping() < 2001) {
            return (priceGalvanizeVeener.getPrice() /
                    numbersOfCutsAndPreviusPrice(galvanizeVeenerDTO.getDeveloping())) * 0.84F;
        } else {
            return (priceGalvanizeVeener.getPrice() /
                    numbersOfCutsAndPreviusPrice(galvanizeVeenerDTO.getDeveloping()));
        }
    }

    public float galvanizeVeenerPriceCalculator(GalvanizeVeenerDTO galvanizeVeenerDTO) {
        float meters = (galvanizeVeenerDTO.getHigh() / 1000F);
        return pricePerMeter(galvanizeVeenerDTO) * meters * galvanizeVeenerDTO.getAmount();

    }
}
