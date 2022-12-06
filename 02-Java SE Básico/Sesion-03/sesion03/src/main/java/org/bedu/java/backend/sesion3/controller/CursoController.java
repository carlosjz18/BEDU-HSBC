package org.bedu.java.backend.sesion3.controller;

import org.bedu.java.backend.sesion3.model.CrearCurso;
import org.bedu.java.backend.sesion3.model.Curso;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class CursoController {

    private List<Curso> cursos;

    public CursoController() {
        /*cursos = List.of(
                new Curso(1L, "Java"),
                new Curso(2L, "Terminal con Linux"),
                new Curso(3L, "Phyton")
        );*/
        cursos = new LinkedList<>();
        cursos.add(new Curso(1L, "Java"));
        cursos.add(new Curso(2L, "Terminal con Linux"));
        cursos.add(new Curso(3L, "Phyton"));
    }

    @GetMapping("/obtenerCursos")
    public List<Curso> obtenerCursos() {
        return cursos;
    }

    @GetMapping("/obtenerCursos/{idCurso}")
    public Curso obtenerCursos(@PathVariable("idCurso") Long idCurso) {
        /*Curso cursoObj = null;

        for (Curso curso : cursos) {
            if (curso.getId().equals(idCurso)) {
                cursoObj = curso;
            }
        }

        return cursoObj;*/
        return cursos.stream().filter(curso -> curso.getId().equals(idCurso)).findFirst().orElse(null);
    }

    @PostMapping("/crearCurso")
    public Curso crearCurso(@RequestBody CrearCurso data) {
        Long ultimoId = cursos.get(cursos.size() - 1).getId();
        Curso cursoNuevo = new Curso(++ultimoId, data.getNombre());
        cursos.add(cursoNuevo);
        return cursoNuevo;
    }
}
