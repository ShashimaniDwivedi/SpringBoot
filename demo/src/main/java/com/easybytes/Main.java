package com.easybytes;

import com.easybytes.Beans.Vehicle;
import com.easybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        System.out.println(vehicle.getName());
//AnnotationConfigApplicationContext it create beans defined inside project config file
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var veh=context.getBean(Vehicle.class);
        System.out.println(veh.getName());

        String h=context.getBean(String.class);
        System.out.println(h);


    }
}
