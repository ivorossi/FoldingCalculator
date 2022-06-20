package com.ivorossi.FoldingCalculator.repository;

import com.ivorossi.FoldingCalculator.model.PriceBlackVeener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceBlackVeenerRepository extends JpaRepository<PriceBlackVeener, Integer> {
    PriceBlackVeener findByManufacture(String manufacture);
}
