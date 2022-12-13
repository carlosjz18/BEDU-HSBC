package mx.com.cj.apipokemon.service;

import mx.com.cj.apipokemon.entity.Pokemon;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IPokemonService {

    List<Pokemon> getAll();

    Pokemon getOneByNumber(int number);

    Pokemon create(Pokemon data);

}
