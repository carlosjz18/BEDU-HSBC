package com.example.sesion08;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String welcome() {
        return "Bienvenido a la API";
    }

    @GetMapping("/saludo")
    public String saluda() {
        return "Hola API";
    }

}
