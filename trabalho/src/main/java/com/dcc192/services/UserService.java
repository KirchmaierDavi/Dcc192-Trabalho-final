package com.dcc192.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.dcc192.models.User;

import com.dcc192.repositories.UserRepository;

public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void save(User usuario) {
        userRepository.save(usuario);
    }
}
