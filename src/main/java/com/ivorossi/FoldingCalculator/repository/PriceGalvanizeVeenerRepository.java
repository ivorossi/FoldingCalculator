package com.ivorossi.FoldingCalculator.repository;

import com.ivorossi.FoldingCalculator.model.PriceBlackVeener;
import com.ivorossi.FoldingCalculator.model.PriceGalvanizeVeener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceGalvanizeVeenerRepository extends JpaRepository<PriceGalvanizeVeener, Integer> {
    PriceGalvanizeVeener findByTypeVeener(String typeVeener);
}
