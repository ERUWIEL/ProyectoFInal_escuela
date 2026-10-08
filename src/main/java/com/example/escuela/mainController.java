package com.example.escuela;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping({"/", "/login", "/login.html"})
    public String login() {
        return "usuario/login";
    }

    @GetMapping({"/recover", "/recover.html"})
    public String recuperarAcceso() {
        return "usuario/recover";
    }

    @GetMapping({"/inicio", "/inicio.html"})
    public String inicio() {
        return "usuario/inicio";
    }

    @GetMapping({"/catalogo", "/catalogo.html"})
    public String catalogo() {
        return "usuario/catalogo";
    }

    @GetMapping({"/materia", "/materia.html", "/materia/{clave}"})
    public String materia() {
        return "usuario/materia";
    }

    @GetMapping({"/carga", "/carga.html", "/carga"})
    public String carga() {
        return "usuario/carga";
    }

    @GetMapping({"/inscritas", "/inscritas.html"})
    public String inscritas() {
        return "usuario/inscritas";
    }
    @GetMapping({"/materias-inscritas", "/materias-ins.html"})
public String materiasInscritas() {
    return "usuario/materias-ins";
}
@GetMapping({"/horario", "/horario.html"})
public String horario() {
    return "usuario/horario";
}
@GetMapping({"/historial", "/historial.html"})
public String historial() {
    return "usuario/historial";
}   
@GetMapping({"/periodo", "/periodo.html","/periodo/{id}"})
public String periodo() {
    return "usuario/periodo";
}
@GetMapping({"/avisos", "/avisos.html"})
public String avisos() {
    return "usuario/avisos";
}
}