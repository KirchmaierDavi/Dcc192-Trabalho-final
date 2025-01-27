package com.dcc192.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/Home.jsp")
    public String homeView() {
        return "Home";
    }
}
