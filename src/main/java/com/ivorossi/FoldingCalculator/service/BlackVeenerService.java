package com.ivorossi.FoldingCalculator.service;

import com.ivorossi.FoldingCalculator.dto.BlackVeenerDTO;
import com.ivorossi.FoldingCalculator.model.PriceBlackVeener;
import com.ivorossi.FoldingCalculator.repository.PriceBlackVeenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlackVeenerService {

    @Autowired
    PriceBlackVeenerRepository priceBlackVeenerRepository;

    private float factorSelected(String veenerThickness) {
        switch (veenerThickness){
            case "24":
                return 0.7F;
            case "22":
                return 0.75F;
            case "20":
                return 0.8F;
            case "18":
                return 1F;
            case"16":
                return 1.3F;
            case"14":
                return 1.6F;
            case"12":
                return 2F;
            case"1/8":
                return 2.7F;
            case "3/16":
                return 4F;
            default:
                return 0F;
        }
    }

    private float areaCalculator(float high, float width) {
        return high * width;
    }

    private float massCalculator(float area, float factor) {
        return (area / 100000) * factor;
    }

    public float blackVeenerPriceCalculator(BlackVeenerDTO blackVeenerDTO) {
        float area, mass;

        PriceBlackVeener priceBlackVeener = priceBlackVeenerRepository
                .findByManufacture(blackVeenerDTO.getTypeManufacture());

        area = areaCalculator(blackVeenerDTO.getHigh(), blackVeenerDTO.getWidth());
        mass = massCalculator(area, factorSelected(blackVeenerDTO.getVeenerThickness()));

        return (mass * priceBlackVeener.getPrice()) * blackVeenerDTO.getAmount();
    }
}
