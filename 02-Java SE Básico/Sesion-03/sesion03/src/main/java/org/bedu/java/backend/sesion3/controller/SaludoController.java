package org.bedu.java.backend.sesion3.controller;

import org.bedu.java.backend.sesion3.model.Saludo;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaludoController {

    @GetMapping("/saludo/{nombre}")
    public Saludo saluda(@PathVariable String nombre) {

        Saludo saludo = new Saludo();
        saludo.setMensaje("¡¡Hola Mundo!!");
        saludo.setNombre(nombre);

        return saludo;
    }

    @PostMapping("/saludo")
    public Saludo saluda(@RequestBody Saludo saludo) {
        saludo.setFechaNacimiento(saludo.getFechaNacimiento().plusDays(1));
        return saludo;
    }

}
