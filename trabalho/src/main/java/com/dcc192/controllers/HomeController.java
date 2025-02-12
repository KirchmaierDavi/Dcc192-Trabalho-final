package com.dcc192.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String homeView() {
        return "Home";
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/Home";
    }
}