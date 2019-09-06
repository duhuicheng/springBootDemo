package com.springBoot.demo.common.util;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class QueueConfig {


    /**
     * 创建消息队列
     * @return
     */
    //队列
    @Bean
    public Queue CalonDirectQueue() {
        return new Queue("rabbitMq",true);
    }


}
