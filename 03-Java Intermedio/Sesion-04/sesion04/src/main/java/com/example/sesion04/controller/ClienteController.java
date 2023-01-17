package com.example.sesion04.controller;

import com.example.sesion04.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("/{clienteId}")
    public ResponseEntity<Cliente> getCliente(@PathVariable long clienteId) {
        if (clienteId > 10) {
            //return ResponseEntity.notFound().build();
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El cliente con el id especificado no existe.");
        }

        if (clienteId > 5) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "No tiene permiso para visualizar al cliente indicado.");
        }

        Cliente cliente = new Cliente();
        cliente.setId(clienteId);
        cliente.setNombre("Cliente");

        return ResponseEntity.ok(cliente);
    }

    @PostMapping
    public ResponseEntity<Void> creaCliente(@Valid @RequestBody Cliente cliente) {
        return ResponseEntity.created(URI.create("")).build();
    }

}
