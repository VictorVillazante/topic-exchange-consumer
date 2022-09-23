package com.example.topicexchangeconsumer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RabbitMQConsumer {

    @RabbitListener(queues = "queue.A")
    private void receiveQueueA(Event event) {
       log.info("Event received from queue A -> {}",event);
    }

    @RabbitListener(queues = "queue.B")
    private void receiveQueueB(Event event) {
        log.info("Event received from queue B -> {}",event);
    }

    @RabbitListener(queues = "queue.C")
    private void receiveQueueC(Event event) {
        log.info("Event received from queue C -> {}",event);
     }
}
