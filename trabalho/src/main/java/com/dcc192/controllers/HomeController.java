package com.dcc192.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Home")
@Controller
public class HomeController {

    @GetMapping
    public String homeView() {
        return "Home";
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/Home";
    }
}