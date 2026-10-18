package com.easybytes.ex3.config;
import com.easybytes.ex3.Beans.Person;
import com.easybytes.ex3.Beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"com.easybytes.ex3.Beans"})
public class ProjectConfig {

//@Bean
//    Vehicle vehicle(){
//    Vehicle v = new Vehicle();
//    v.setName("Toyota");
//    return v;
//}

   /* @Bean
    Person person(){
        Person p = new Person();
        p.setName("Shashi");
        p.setVehicle(vehicle());
        return p;
    }*/
//   @Bean
//   Person person(Vehicle v){
//       Person p = new Person();
//       p.setName("Shashi");
//       p.setVehicle(v);
//       return p;
//   }


}