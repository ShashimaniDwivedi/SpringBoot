package com.easybytes.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController{
//    @GetMapping("/home")
    @RequestMapping("/home")
    public String sayHello(){
        return "Hello Spring Boot";
    }


}