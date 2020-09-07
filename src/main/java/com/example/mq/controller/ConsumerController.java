package com.example.mq.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Session;
import javax.jms.TextMessage;

@Component
public class ConsumerController {

    // 使用JmsListener配置消费者监听的队列，其中name是接收到的消息
    @JmsListener(destination = "testQueue1", containerFactory = "jmsQueueListener")
    // SendTo 会将此方法返回的数据, 写入到 OutQueue 中去.
    //@SendTo("SQueue")
    public void handleMessage(TextMessage text, Session session) throws Exception {
        String name = text.getText();
        System.out.println("成功接受Name" + name);
        Thread.sleep(3000);
        text.acknowledge();// 使用手动签收模式，需要手动的调用
        // session.recover();// 此不可省略 重发信息使用
    }
}
