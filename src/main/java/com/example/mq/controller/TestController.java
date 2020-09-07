package com.example.mq.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;


@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private Queue queue1;
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @GetMapping("/mq")
    public void mq(String name) {
      /*  for (int i = 0; i < 20; i++) {
            jmsMessagingTemplate.convertAndSend(queue1, name + i);
        }*/
        jmsMessagingTemplate.convertAndSend(queue1, name );
    }
}

