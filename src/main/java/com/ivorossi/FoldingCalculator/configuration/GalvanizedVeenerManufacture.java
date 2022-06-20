package com.ivorossi.FoldingCalculator.configuration;

import com.ivorossi.FoldingCalculator.model.PriceGalvanizedVeener;
import com.ivorossi.FoldingCalculator.repository.PriceGalvanizedVeenerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GalvanizedVeenerManufacture {

    @Bean
    public CommandLineRunner autoSaveGalvanizedManufacture(
            PriceGalvanizedVeenerRepository priceGalvanizeVeenerRepository) {

        return args -> {
            priceGalvanizeVeenerRepository.save(new PriceGalvanizedVeener(1, "prepintada", 10000f));
            priceGalvanizeVeenerRepository.save(new PriceGalvanizedVeener(2, "galv.25", 5000f));
            priceGalvanizeVeenerRepository.save(new PriceGalvanizedVeener(3, "galv.22", 3000f));
        };
    }
}