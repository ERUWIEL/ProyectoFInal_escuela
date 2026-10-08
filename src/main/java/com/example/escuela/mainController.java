package com.example.escuela;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping({"/", "/login", "/login.html"})
    public String login() {
        return "login";
    }

    @GetMapping({"/recover", "/recover.html"})
    public String recuperarAcceso() {
        return "recover";
    }
    @GetMapping({"/inicio", "/inicio.html"})
public String inicio() {
    return "inicio";
}
}