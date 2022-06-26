package com.ivorossi.FoldingCalculator.configuration;

import com.ivorossi.FoldingCalculator.model.Role;
import com.ivorossi.FoldingCalculator.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RoleConfiguration {
    @Bean
    public CommandLineRunner autoSaveRoles(RoleRepository roleRepository) {
        return args -> {
            List<Role> checkEmptyRoles = roleRepository.findAll();
            if (checkEmptyRoles.size() <= 0){
                roleRepository.save(new Role("STANDARD"));
                roleRepository.save(new Role("ADMIN"));
            }
        };
    }
}


