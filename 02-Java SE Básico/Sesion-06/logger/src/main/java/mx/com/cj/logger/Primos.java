package mx.com.cj.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Primos {

    private static Logger log = LoggerFactory.getLogger(Primos.class);

    public void validarNumPrimo(int numero) {

        if (numero < 0) {
            log.error("El número no puede ser negavito / num {}", numero);
            return;
        }

        if (numero == 0 || numero == 1 || numero == 4) {
            log.warn("El número {} no es primo", numero);
            return;
        }

        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0) {
                log.warn("El número {} no es primo", numero);
                return;
            }
        }
        log.info("El número {} si es primo", numero);
    }
}
