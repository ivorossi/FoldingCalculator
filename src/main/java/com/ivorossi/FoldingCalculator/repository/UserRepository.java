package com.ivorossi.FoldingCalculator.repository;

import com.ivorossi.FoldingCalculator.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
