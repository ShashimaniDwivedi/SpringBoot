package com.easybytes.ex1.config;

import com.easybytes.ex1.Beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Primary
    @Bean(name = "Audi")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean(value ="Bmw")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Bean("tesla")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Tesla");
        return veh;
    }


}