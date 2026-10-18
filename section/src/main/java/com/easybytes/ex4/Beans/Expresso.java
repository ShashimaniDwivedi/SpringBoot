package com.easybytes.ex4.Beans;

import org.springframework.stereotype.Component;

@Component("espresso")
public class Expresso implements Coffee{
    public String makeCoffee(){
        return ("Making Expresso");
    }
}
