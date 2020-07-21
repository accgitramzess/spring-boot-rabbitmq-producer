package src.springboot.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rabbitmq/")
public class RestEndpoint {

    @Autowired
    private RabbitMqProducer rabbitMqProducer;

    @PostMapping(value = "/producer")
    public String producer(@RequestBody Event event) {
        rabbitMqProducer.send(event);

        return "Message sent to the RabbitMQ Successfully";
    }
}
