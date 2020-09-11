package com.christ.smartvideo2.impl;

import com.christ.smartvideo2.domain.User;
import com.christ.smartvideo2.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public User sayHello() {
        User user=new User("test","2020031301","123456","15478242588","test@gmail.com");
        return user;
    }
}
