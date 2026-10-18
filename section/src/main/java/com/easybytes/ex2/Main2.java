package com.easybytes.ex2;

import com.easybytes.ex2.Beans.Vehicle;
import com.easybytes.ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    static void main() {
        System.out.println("Welcome");
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var veh=context.getBean(Vehicle.class);
        System.out.println(veh.getName());
        System.out.println(veh.sayHello());
        context.close();
    }
}
