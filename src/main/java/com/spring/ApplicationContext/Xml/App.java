package com.spring.ApplicationContext.Xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext-Xml-bean.xml");

        Vehicle v1 = (Vehicle) context.getBean("myVehicle");
        v1.getMileage();

        Vehicle v2 = (Vehicle) context.getBean("myVehicle2");
        v2.getMileage();
    }
}
