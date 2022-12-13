package mx.com.cj.apipokemon.service;

import mx.com.cj.apipokemon.entity.Trainer;

import java.util.List;

public interface ITrainerService {

    List<Trainer> getAll();

    Trainer getOneByName(String name);
}
