package com.ivorossi.FoldingCalculator.repository;

import com.ivorossi.FoldingCalculator.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
