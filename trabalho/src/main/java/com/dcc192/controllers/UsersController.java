package com.dcc192.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.dcc192.models.User;
import com.dcc192.repositories.UserRepository;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/Users.jsp")
    public String userList(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "Users";
    }
    
}
