package src.springboot.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Producer {

    public static void main(String[] args) {
        SpringApplication.run(new Object[] { Producer.class }, args);
    }
}
