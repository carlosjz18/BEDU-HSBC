package com.example.sesion09;

import com.example.sesion09.model.Cliente;
import com.example.sesion09.model.Usuario;
import com.example.sesion09.repository.ClienteRepository;
import com.example.sesion09.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    private UsuarioRepository usuarioRepository;
    private ClienteRepository clienteRepository;

    public Runner(UsuarioRepository usuarioRepository, ClienteRepository clienteRepository) {
        this.usuarioRepository = usuarioRepository;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Usuario usuario = new Usuario();
        usuario.setNombre("Carlos");
        usuario.setEmail("carlos@gmail.com");
        usuario.setPassword("$2a$10$MNuFnlsyUuQq4U5W4BMVmu3IlIQpMKGiXHnrow3Oq3/7UvFe.ZSvi");
        usuario.setRol("ADMIN");

        usuarioRepository.save(usuario);

        List<Cliente> clientes = List.of(
                new Cliente("Pepe", LocalDate.now(), "777-123-22-31", "pepe@gmail.com"),
                new Cliente("Juan", LocalDate.now(), "777-999-63-09", "juan@gmail.com")
        );
        clienteRepository.saveAll(clientes);

    }
}
