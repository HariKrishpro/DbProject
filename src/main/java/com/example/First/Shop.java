package com.example.First;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Shop {
    public Shop() {
        System.out.println("OBJECT CREATED .....*");
    }

    public void print(){
//        System.out.println("Object Is Created");
    }

}
