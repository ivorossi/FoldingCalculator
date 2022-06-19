package com.ivorossi.FoldingCalculator.service;

import com.ivorossi.FoldingCalculator.dto.BlackVeenerDTO;
import com.ivorossi.FoldingCalculator.model.PriceBlackVeener;
import com.ivorossi.FoldingCalculator.repository.PriceVeenerBlackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlackVeenerService {

    @Autowired
    PriceVeenerBlackRepository priceVeenerBlackRepository;

    private float factorSelected(String veenerThickness) {
        return switch (veenerThickness) {
            case "24" -> 0.7F;
            case "22" -> 0.75F;
            case "20" -> 0.8F;
            case "18" -> 0.9F;
            case "16" -> 1.3F;
            case "14" -> 1.6F;
            case "12" -> 2F;
            case "1/8" -> 2.7F;
            case "3/16" -> 4F;
            default -> 0F;
        };
    }

    private float areaCalculator(float high, float width) {
        return high * width;
    }

    private float massCalculator(float area, float factor) {
        return (area / 100000) * factor;
    }

    public float blackVeenerPriceCalculator(BlackVeenerDTO blackVeenerDTO) {
        float area, mass;

        PriceBlackVeener priceBlackVeener = priceVeenerBlackRepository
                .findByManufacture(blackVeenerDTO.getTypeManufacture());

        area = areaCalculator(blackVeenerDTO.getHigh(), blackVeenerDTO.getWidth());
        mass = massCalculator(area, factorSelected(blackVeenerDTO.getVeenerThickness()));

        return (mass * priceBlackVeener.getPrice()) * blackVeenerDTO.getAmount();
    }
}
