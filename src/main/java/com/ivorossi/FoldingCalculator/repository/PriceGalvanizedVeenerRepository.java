package com.ivorossi.FoldingCalculator.repository;

import com.ivorossi.FoldingCalculator.model.PriceGalvanizedVeener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceGalvanizedVeenerRepository extends JpaRepository<PriceGalvanizedVeener, Integer> {
    PriceGalvanizedVeener findByTypeVeener(String typeVeener);
}
