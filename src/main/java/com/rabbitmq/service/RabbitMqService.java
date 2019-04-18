package com.rabbitmq.service;

import com.rabbitmq.pojo.User;

/**
 * Created by user on 2019/4/18.
 */
public interface RabbitMqService {

    //发送字符串消息
    public void sendMsg(String msg);
    //发送用户消息
    public void sendUser(User user);
}
