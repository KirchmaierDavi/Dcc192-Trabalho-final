package com.dcc192.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AjudaController {
    @GetMapping("/Ajuda.jsp")
    public String ajudaView() {
        return "Ajuda";
    }
    
}
