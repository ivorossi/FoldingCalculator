package com.ivorossi.FoldingCalculator.service;

import java.util.ArrayList;

import com.ivorossi.FoldingCalculator.model.User;
import com.ivorossi.FoldingCalculator.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ArrayList<User> getUsers() {
        return (ArrayList<User>) userRepository.findAll();
    }
}
