package com.rabbitmq.service;

import com.rabbitmq.pojo.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by user on 2019/4/18.
 */
@Component
public class RabbitMessageReceiver {

    @RabbitListener(queues = {"${rabbitmq.queue.msg}"})
    public void receiveMsg(String msg) {
        System.out.println("收到的消息：" + msg);
    }

    @RabbitListener(queues = {"${rabbitmq.queue.user}"})
    public void receiverUser(User user) {
        System.out.println("收到的用户：" + user.toString());
    }
}
