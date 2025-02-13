package com.dcc.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ErroController implements ErrorController {

    @GetMapping("/error")
    public String handleError(HttpServletRequest request, Model model) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        String erroMsg = "Erro inesperado";

        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());

            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                erroMsg = "Página não encontrada";
            } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                erroMsg = "Erro no servidor interno";
            } else if (statusCode == HttpStatus.FORBIDDEN.value()) {
                erroMsg = "Acesso negado";
            } else if (statusCode == HttpStatus.BAD_REQUEST.value()) {
                erroMsg = "Requisição inválida";
            }
        }

        model.addAttribute("erroMsg", erroMsg);
        return "error";
    }
}