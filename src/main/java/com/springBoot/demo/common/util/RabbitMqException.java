package com.springBoot.demo.common.util;

import org.springframework.amqp.AmqpConnectException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RabbitMqException {

    @ExceptionHandler(value = {AmqpConnectException.class})
    public void mqException(){
        System.out.println("未使用消息队列");
    }
}
