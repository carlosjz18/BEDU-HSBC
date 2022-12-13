package mx.com.cj.apipokemon.controller;

import mx.com.cj.apipokemon.entity.Trainer;
import mx.com.cj.apipokemon.service.ITrainerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/trainer/")
public class TrainerController {

    private ITrainerService trainerService;

    public TrainerController(ITrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping("/getAllTrainer")
    public List<Trainer> getAllTrainer() {
        return trainerService.getAll();
    }

    @GetMapping("/getOneTrainer/{name}")
    public Trainer getOneTrainer(@PathVariable String name) {
        return trainerService.getOneByName(name);
    }
}
