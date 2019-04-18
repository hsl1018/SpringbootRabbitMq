package com.rabbitmq.service;

import com.rabbitmq.pojo.User;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by user on 2019/4/18.
 */
@Service
public class RabbitMqServiceImpl implements RabbitTemplate.ConfirmCallback, RabbitMqService {

    //消息队列名称
    @Value("${rabbitmq.queue.msg}")
    private String msgRouting = null;

    //用户队列名称
    @Value("${rabbitmq.queue.user}")
    private String userRouting = null;

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        if (b) {
            System.out.println("消息成功消费");
        } else {
            System.out.println("消息消费失败：" + s);
        }
    }

    @Override
    public void sendMsg(String msg) {
        System.out.println("发送消息【" + msg + "】");
        rabbitTemplate.setConfirmCallback(this);
        rabbitTemplate.convertAndSend(msgRouting, msg);
    }

    @Override
    public void sendUser(User user) {
        System.out.println("发送消息【" + user + "】");
        rabbitTemplate.setConfirmCallback(this);
        rabbitTemplate.convertAndSend(userRouting, user);
    }
}
