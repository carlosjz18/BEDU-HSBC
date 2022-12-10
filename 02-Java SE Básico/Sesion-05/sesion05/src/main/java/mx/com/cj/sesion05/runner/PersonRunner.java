package mx.com.cj.sesion05.runner;

import mx.com.cj.sesion05.model.Person;
import mx.com.cj.sesion05.repository.IPersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonRunner implements CommandLineRunner {

    private final IPersonRepository personRepository;

    public PersonRunner(IPersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Person> persons = List.of(
                createPerson("Pepe", "López", 22),
                createPerson("Ana", "Castillo", 33),
                createPerson("Juan", "Durango", 45),
                createPerson("Monguito", "Mon", 11),
                createPerson("Sofia", "Fuentes", 52)
        );
        personRepository.saveAll(persons);
    }

    private Person createPerson(String name, String lastName, int age) {
        Person person = new Person();
        person.setName(name);
        person.setLastName(lastName);
        person.setAge(age);
        return person;
    }
}
