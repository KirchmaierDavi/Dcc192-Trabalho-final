package com.dcc192.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage(@RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout,
            Model model) {

        if (error != null) {
            model.addAttribute("error", "Usuário ou senha inválidos!");
        }

        if (logout != null) {
            model.addAttribute("message", "Logout realizado com sucesso!");
        }

        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/Login";
    }

    @GetMapping("/Home")
    public String menu() {
        return "Home";
    }

    @PostMapping("/login")
    public String processLogin() {
        return "redirect:/Users";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/Login?logout";
    }
}