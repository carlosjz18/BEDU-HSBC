package mx.com.cj.apipokemon.service;

import mx.com.cj.apipokemon.entity.Pokemon;
import mx.com.cj.apipokemon.repository.IPokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonServiceImpl implements IPokemonService {

    private IPokemonRepository pokemonRepository;

    public PokemonServiceImpl(IPokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @Override
    public List<Pokemon> getAll() {
        return pokemonRepository.findAll();
    }

    @Override
    public Pokemon getOneByNumber(int number) {
        return pokemonRepository.findPokemonByNumber(number);
    }

    @Override
    public Pokemon create(Pokemon data) {
        return pokemonRepository.save(data);
    }
}
