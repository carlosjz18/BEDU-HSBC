package mx.com.cj.jms;

import lombok.extern.slf4j.Slf4j;
import mx.com.cj.jms.model.Email;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Producer implements CommandLineRunner {

    @Value("${rabbitmq.exchange}")
    private String TOPIC_EXCHANGE_NAME;

    @Value("${rabbitmq.routing}")
    private String ROUTING_KEY;

    private RabbitTemplate template;

    public Producer(RabbitTemplate template) {
        this.template = template;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Enviando mensaje");
        template.convertAndSend(TOPIC_EXCHANGE_NAME, ROUTING_KEY,
                new Email("Aviso", "carlos@gmail.com", "ventas@gmail.com",
                        "Se necesita que registre sus datos fiscales"));
    }
}
