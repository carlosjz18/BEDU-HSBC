package org.bedu.java.backend.sesion3.controller;

import org.bedu.java.backend.sesion3.model.Curso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!!!";
    }

    @GetMapping("/goodbye")
    public String goodBye() {
        return "Good Bye!!!";
    }

    @GetMapping("/curso")
    public Curso enviarCurso() {
        return new Curso(100L, "Backend Java");
    }

}
