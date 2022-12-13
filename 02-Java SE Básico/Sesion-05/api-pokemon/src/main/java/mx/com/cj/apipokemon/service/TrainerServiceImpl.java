package mx.com.cj.apipokemon.service;

import mx.com.cj.apipokemon.entity.Trainer;
import mx.com.cj.apipokemon.repository.ITrainerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements ITrainerService {

    private ITrainerRepository trainerRepository;

    public TrainerServiceImpl(ITrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public List<Trainer> getAll() {
        return trainerRepository.findAll();
    }

    @Override
    public Trainer getOneByName(String name) {
        return trainerRepository.findOneByName(name);
    }

}
