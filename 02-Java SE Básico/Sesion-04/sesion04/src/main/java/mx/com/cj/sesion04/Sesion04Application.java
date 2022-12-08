package mx.com.cj.sesion04;

import mx.com.cj.sesion04.beans.model.Greeting;
import mx.com.cj.sesion04.components.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Sesion04Application implements CommandLineRunner {

    private Greeting greeting;
    private Persona persona;

    /*@Autowired
    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }*/

    public Sesion04Application(Greeting greeting, Persona persona) {
        this.greeting = greeting;
        this.persona = persona;
    }

    public static void main(String[] args) {
        SpringApplication.run(Sesion04Application.class, args);
    }

    @PostConstruct
    public void init() {
        persona.setName("Carlos");
    }

    @Override
    public void run(String... args) throws Exception {
        //System.out.println("Hello World!!!");
        System.out.println(greeting.greeting("Carlos"));
        System.out.println(persona.greet("Pepe"));
    }
}
