package com.dcc192.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class AjudaController {

    @GetMapping("/ajuda")
    public String ajudaView(Model model) {
        try {
            model.addAttribute("titulo", "Página de Ajuda");
            model.addAttribute("conteudo", "Aqui você encontra informações sobre o sistema.");
            return "Ajuda";
        } catch (Exception e) {
            model.addAttribute("error", "Erro ao carregar página de ajuda");
            return "error";
        }
    }
}