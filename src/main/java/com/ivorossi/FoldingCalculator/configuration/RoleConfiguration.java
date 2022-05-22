package com.ivorossi.FoldingCalculator.configuration;

import com.ivorossi.FoldingCalculator.model.Role;
import com.ivorossi.FoldingCalculator.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoleConfiguration {
    @Bean
    public CommandLineRunner autoSaveRoles(RoleRepository roleRepository) {
        return args -> {
            roleRepository.save(new Role(1L, "STANDARD"));
            roleRepository.save(new Role(2L, "ADMIN"));
        };
    }
}


