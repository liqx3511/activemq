package com.example.mq.config;


import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

@Configuration
public class BeanConfig {
    //定义存放消息的队列
    @Bean
    public Queue queue1() {
        return new ActiveMQQueue("testQueue1");
    }

    @Bean
    public Queue queue2() {
        return new ActiveMQQueue("testQueue2");
    }
}

