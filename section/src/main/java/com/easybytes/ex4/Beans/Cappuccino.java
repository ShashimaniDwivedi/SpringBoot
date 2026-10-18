package com.easybytes.ex4.Beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("cappuccino")
@Primary
public class Cappuccino implements Coffee{
    public String makeCoffee(){
        return ("Making Cappuccino");
    }
}
