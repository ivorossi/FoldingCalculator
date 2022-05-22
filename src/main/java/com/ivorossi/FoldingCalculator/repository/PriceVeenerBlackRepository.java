package com.ivorossi.FoldingCalculator.repository;

import com.ivorossi.FoldingCalculator.model.PriceBlackVeener;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceVeenerBlackRepository extends JpaRepository<PriceBlackVeener, Integer> {
    PriceBlackVeener findByManufacture(String manufacture);
}
