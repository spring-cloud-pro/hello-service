package com.levyx.helloservice.controller;

import com.levyx.helloservice.model.User;
import com.levyx.helloservice.service.HelloService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefactHelloController implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello "+name;
    }

    @Override
    public User hello(String name, Integer age) {
        return new User(name,age);
    }

    @Override
    public String hello(User user) {
        return "Hello " + user.getName() + ",age=" + user.getAge();
    }
}
