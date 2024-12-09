package com.spring.DI.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.DI.Annotations");
        Vehicle bean = (Vehicle) context.getBean("car");
        bean.getMileage();
        System.out.println(bean.getDiscount());

        Vehicle bean1 = (Vehicle) context.getBean("bike");
        bean1.getMileage();
        System.out.println(bean1.getDiscount());

        Vehicle bean3 = (Vehicle) context.getBean("car");
        System.out.println(bean == bean3);
    }
}
