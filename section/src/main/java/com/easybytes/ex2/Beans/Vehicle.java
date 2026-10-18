package com.easybytes.ex2.Beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Vehicle implements InitializingBean {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

   public String sayHello(){
        return "Hello";
    }

//    @PostConstruct
//    public void initialize() {
//        this.setName("Ferari");
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.setName("Ferari");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroying Bean");
    }
}
