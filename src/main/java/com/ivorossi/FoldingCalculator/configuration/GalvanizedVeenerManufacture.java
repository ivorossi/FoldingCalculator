package com.ivorossi.FoldingCalculator.configuration;

import com.ivorossi.FoldingCalculator.model.PriceBlackVeener;
import com.ivorossi.FoldingCalculator.model.PriceGalvanizedVeener;
import com.ivorossi.FoldingCalculator.repository.PriceGalvanizedVeenerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class GalvanizedVeenerManufacture {

    @Bean
    public CommandLineRunner autoSaveGalvanizedManufacture(
            PriceGalvanizedVeenerRepository priceGalvanizeVeenerRepository) {

        return args -> {
            List<PriceGalvanizedVeener> listGalvanized = priceGalvanizeVeenerRepository.findAll();
            if (listGalvanized.size() != 3) {
                priceGalvanizeVeenerRepository.save(new PriceGalvanizedVeener("prepintada", 10000f));
                priceGalvanizeVeenerRepository.save(new PriceGalvanizedVeener("galv.25", 5000f));
                priceGalvanizeVeenerRepository.save(new PriceGalvanizedVeener("galv.22", 3000f));
            }
        };
    }
}
