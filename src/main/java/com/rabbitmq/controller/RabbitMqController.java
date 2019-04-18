package com.rabbitmq.controller;

import com.rabbitmq.pojo.User;
import com.rabbitmq.service.RabbitMqServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 2019/4/18.
 */
@RestController
@RequestMapping("/rabbitmq")
public class RabbitMqController {

    @Autowired
    RabbitMqServiceImpl rabbitMqService;


    @PostMapping("/sendstrmsg")
    public void sendMsg(String msg) {
        rabbitMqService.sendMsg(msg);
    }

    @PostMapping("/sendobjmsg")
    public void sendUser() {
        User user = new User();
        user.setId("001");
        user.setName("张三");
        rabbitMqService.sendUser(user);
    }
}
