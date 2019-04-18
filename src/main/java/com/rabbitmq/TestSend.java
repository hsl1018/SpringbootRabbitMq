package com.rabbitmq;

import com.rabbitmq.service.RabbitMqServiceImpl;

/**
 * Created by user on 2019/4/18.
 */
public class TestSend {

    public static void main(String args[]) {
        RabbitMqServiceImpl rabbitMqService = new RabbitMqServiceImpl();
        rabbitMqService.sendMsg("这是一条测试消息");
    }
}
