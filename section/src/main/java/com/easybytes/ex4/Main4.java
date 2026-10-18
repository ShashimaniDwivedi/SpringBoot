package com.easybytes.ex4;
import com.easybytes.ex4.config.ProjectConfig;
import com.easybytes.ex4.Beans.Coffee;
import com.easybytes.ex4.Beans.CoffeeShop;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main4 {
    static void main() {
        System.out.println("Welcome");
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var coffeeshop=context.getBean(CoffeeShop.class);
        Coffee coffee = coffeeshop.getCoffee();
        System.out.println(coffee.makeCoffee());

    }
}
