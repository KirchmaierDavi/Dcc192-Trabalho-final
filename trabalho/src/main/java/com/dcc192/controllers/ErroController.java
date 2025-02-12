package com.dcc192.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ErroController implements org.springframework.boot.web.servlet.error.ErrorController {
    
    @GetMapping("/error")
    public String handleError(HttpServletRequest request, Model model) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        String erroMsg = "";
        
        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());
            
            if(statusCode == HttpStatus.NOT_FOUND.value()) {
                erroMsg = "Página não encontrada";
            }
            else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                erroMsg = "Erro no servidor interno";
            }
        }
        
        model.addAttribute("erroMsg", erroMsg);
        return "erro";
    }
}