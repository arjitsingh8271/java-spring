package com.spring.DI.Xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("DI-Xml-bean.xml");
        Vehicle v1 = (Vehicle) context.getBean("myVehicle");
        v1.getMileage();
        System.out.println(v1.getDiscount());
        System.out.println(v1.getBrandName());

        System.out.println();

        Vehicle v2 = (Vehicle) context.getBean("myVehicle2");
        v2.getMileage();
        System.out.println(v2.getDiscount());
        System.out.println(v2.getBrandName());

        System.out.println();

        Cycle cycle = (Cycle) context.getBean("cycle");
        cycle.getOffer();

    }
}

