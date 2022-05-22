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
    private float factorSelected(String veenerThickness){
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

    public float blackVeenerPriceCalculator(BlackVeenerDTO blackVeenerDTO){
        PriceBlackVeener priceBlackVeener = priceVeenerBlackRepository.findByManufacture(blackVeenerDTO.getTypeManufacture());
        float area = blackVeenerDTO.getHigh() * blackVeenerDTO.getWidth();
        float mass = (area / 100000)* this.factorSelected(blackVeenerDTO.getVeenerThickness());
        return (mass * priceBlackVeener.getPrice()) * blackVeenerDTO.getAmount();

    }
}
