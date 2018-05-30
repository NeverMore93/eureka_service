package com.ywt.eureka_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello eureka service";
    }

    @GetMapping( "/test")
    public String test(){
        return "eureka service test";
    }
}
