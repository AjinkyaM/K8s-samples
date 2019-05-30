package com.k8s.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello : "+ LocalDateTime.now();
    }
}
