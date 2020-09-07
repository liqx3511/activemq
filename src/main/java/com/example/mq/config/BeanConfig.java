package com.example.mq.config;


import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/*
 * @author uv
 * @date 2018/9/15 14:21
 */
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

