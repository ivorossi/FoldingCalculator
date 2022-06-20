package com.ivorossi.FoldingCalculator.configuration;

import com.ivorossi.FoldingCalculator.model.User;
import com.ivorossi.FoldingCalculator.repository.RoleRepository;
import com.ivorossi.FoldingCalculator.repository.UserRepository;
import com.ivorossi.FoldingCalculator.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCrypt;


@Configuration
public class UserConfiguration {

    private String passwordAdminEncrypt() {
        return BCrypt.hashpw("test", BCrypt.gensalt(12));
    }

    @Bean
    public CommandLineRunner autoSaveUserAdmin(UserRepository userRepository, RoleRepository roleRepository) {
        return args -> {
            userRepository.save(new User("gianca", passwordAdminEncrypt(),"gianca9405@gmail.com", roleRepository.getById(2L)));
        };
    }
}
