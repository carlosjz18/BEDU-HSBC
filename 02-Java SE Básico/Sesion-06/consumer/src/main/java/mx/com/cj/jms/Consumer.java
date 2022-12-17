package mx.com.cj.jms;

import lombok.extern.slf4j.Slf4j;
import mx.com.cj.jms.model.Email;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {

    @RabbitListener(queues = {"${rabbitmq.queue}"})
    public void consume(Email email) {
        log.info("Mensaje recibido");
        log.info(email.toString());
    }
}
