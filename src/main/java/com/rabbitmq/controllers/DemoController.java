package com.rabbitmq.controllers;

import com.rabbitmq.messages.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @GetMapping("/demo/{name}")
    public String demoAPI(@PathVariable("name") String name) {
        User user = new User(1L, name);
        rabbitTemplate.convertAndSend("Mobile",user);
        return "Success";
    }
}
