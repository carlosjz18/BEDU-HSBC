package com.example.ejemplo01.controller;

import com.example.ejemplo01.model.Producto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProdcutoController {

    @GetMapping
    public ResponseEntity<Producto> getProducto() {
        Producto p = new Producto();
        p.setId(0);
        p.setName("planta");
        p.setPrice(235.5);

        return ResponseEntity.ok(p);
    }

}
