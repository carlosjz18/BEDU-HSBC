package mx.com.cj.sesion04.beans.config;

import mx.com.cj.sesion04.beans.model.Greeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Greeting greeting() {
        return new Greeting("Carlos");
    }

}
