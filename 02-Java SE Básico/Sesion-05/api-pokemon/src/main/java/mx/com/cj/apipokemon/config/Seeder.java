package mx.com.cj.apipokemon.config;

import mx.com.cj.apipokemon.entity.Pokemon;
import mx.com.cj.apipokemon.entity.Trainer;
import mx.com.cj.apipokemon.repository.IPokemonRepository;
import mx.com.cj.apipokemon.repository.ITrainerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Seeder implements CommandLineRunner {

    private IPokemonRepository pokemonRepository;
    private ITrainerRepository trainerRepository;

    public Seeder(IPokemonRepository pokemonRepository, ITrainerRepository trainerRepository) {
        this.pokemonRepository = pokemonRepository;
        this.trainerRepository = trainerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Pokemon pikachu = pokemonRepository.findPokemonByNumber(25);

        if (pikachu == null) {
            Pokemon p1 = new Pokemon();
            p1.setName("Pikachu");
            p1.setNumber(25);

            pokemonRepository.save(p1);
        }

        Trainer ash = trainerRepository.findOneByName("Ash Ketchup");

        if (ash == null) {
            Trainer t = new Trainer();
            t.setName("Ash Ketchup");

            trainerRepository.save(t);
        }
    }
}
