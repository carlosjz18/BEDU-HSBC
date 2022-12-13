package mx.com.cj.apipokemon.controller;

import mx.com.cj.apipokemon.entity.Pokemon;
import mx.com.cj.apipokemon.service.IPokemonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

    private IPokemonService pokemonService;

    public PokemonController(IPokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Pokemon> getAllPokemon() {
        return pokemonService.getAll();
    }

    @GetMapping("/{number}")
    public Pokemon getOnePokemon(@PathVariable int number) {
        return pokemonService.getOneByNumber(number);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pokemon create(@RequestBody Pokemon pokemon) {
        return pokemonService.create(pokemon);
    }

}
