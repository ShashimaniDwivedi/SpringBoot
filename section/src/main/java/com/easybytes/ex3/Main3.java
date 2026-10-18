package com.easybytes.ex3;

import com.easybytes.ex3.Beans.Car;
import com.easybytes.ex3.Beans.Engine;
import com.easybytes.ex3.Beans.Person;
import com.easybytes.ex3.Beans.Vehicle;
import com.easybytes.ex3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main3 {
    static void main() {
        System.out.println("Welcome");
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var veh=context.getBean(Vehicle.class);
        var per=context.getBean(Person.class);
        System.out.println(veh.getName());
        System.out.println(per.getName());
        System.out.println(per.getVehicle());

        var c=context.getBean(Car.class);
        var e=context.getBean(Engine.class);
        System.out.println(c.getName());
        System.out.println(e.getName());
        System.out.println(c.getEngine());


    }
}
