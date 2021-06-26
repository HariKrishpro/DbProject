package com.example.First;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class first {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Shop shop = context.getBean("shop",Shop.class);
        shop.print();
//        context.getBean(Shop.class);
    }
}
