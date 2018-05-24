package com.ywt.eureka_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(name = "/hello")
    public String hello(){
        return "Hello eureka service";
    }
}
