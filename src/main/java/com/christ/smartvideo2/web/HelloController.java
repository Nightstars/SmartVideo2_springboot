package com.christ.smartvideo2.web;

import com.christ.smartvideo2.domain.User;
import com.christ.smartvideo2.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class HelloController {

    private HelloService helloService;
    @Autowired
    public void setHelloService(HelloService helloService){
        this.helloService=helloService;
    }
    @RequestMapping("/hello")
    @ResponseBody
    public User helloworld(){
        System.out.println("visited");
        return helloService.sayHello();
    }
}
