package com.ivorossi.FoldingCalculator.configuration;

import com.ivorossi.FoldingCalculator.model.PriceBlackVeener;
import com.ivorossi.FoldingCalculator.repository.PriceBlackVeenerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BlackVeenerManufacture {

    @Bean
    public CommandLineRunner autoSaveManufacture(PriceBlackVeenerRepository priceVeenerBlackRepository) {
        return args -> {
            priceVeenerBlackRepository.save(new PriceBlackVeener(1, "MMOP", 650f));
            priceVeenerBlackRepository.save(new PriceBlackVeener(2, "MMOL", 550f));
            priceVeenerBlackRepository.save(new PriceBlackVeener(3, "MOP", 140f));
            priceVeenerBlackRepository.save(new PriceBlackVeener(4, "MOL", 90f));
        };
    }
}
