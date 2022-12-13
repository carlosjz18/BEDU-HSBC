package mx.com.cj.apipokemon.repository;

import mx.com.cj.apipokemon.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPokemonRepository extends JpaRepository<Pokemon, Long> {

    Pokemon findPokemonByNumber(int number);

    Pokemon findOneByNumber(int number);

}
