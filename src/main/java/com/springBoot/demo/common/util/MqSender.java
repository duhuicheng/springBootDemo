package com.springBoot.demo.common.util;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MqSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String msg){
        this.amqpTemplate.convertAndSend("rabbitMq",msg);
    }
}
