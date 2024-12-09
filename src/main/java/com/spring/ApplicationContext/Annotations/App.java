package com.spring.ApplicationContext.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        // 1. Launch a Spring Context
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);

        // 2. Spring manage configure things:
        // HelloConfig - @Configuration
        // name - @Bean

        // 3. Retrieving Beans manage by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("student"));
        System.out.println(context.getBean("Add"));
        System.out.println(context.getBean("personMethodCall"));
        System.out.println(context.getBean("personParameters"));

        // return all Bean names
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);



    }
}
