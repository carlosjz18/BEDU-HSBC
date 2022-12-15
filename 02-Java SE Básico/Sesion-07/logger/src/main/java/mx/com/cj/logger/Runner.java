package mx.com.cj.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private Primos primos;

    private static Logger log = LoggerFactory.getLogger(Runner.class);

    public Runner(Primos primos) {
        this.primos = primos;
    }

    /*
        TRACE:
        DEBUG: Mensajes para debug de la app
        INFO: Cosas importantes que pasan en la app
        WARN: Problemas de los que nos podemos recuperar
        ERROR: Problemas de los que no nos podemos recuperar
        OFF:
    */

    @Override
    public void run(String... args) throws Exception {
        String name = "Demo de Loggers";

        log.trace("Hello World");
        log.debug("App: {}", name);
        log.info("Aplicación de Spring Boot inicializada");
        log.warn("El método debe recibir una cadena no vacía");
        log.error("Hubo un problema critico en la app");

        primos.validarNumPrimo(-8);
        primos.validarNumPrimo(4);
        primos.validarNumPrimo(13);
    }
}
