package com.easybytes.config;

import com.easybytes.Beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Tesla");
        return veh;
    }
    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer lucky(){
        return 16;
    }

}