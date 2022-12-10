package mx.com.cj.sesion05.controller;

import mx.com.cj.sesion05.model.Person;
import mx.com.cj.sesion05.repository.IPersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    private final IPersonRepository personRepository;

    public PersonController(IPersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/getAll")
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @PostMapping
    public Person savePerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

}
