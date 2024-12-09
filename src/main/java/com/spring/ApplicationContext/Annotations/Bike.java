package com.spring.ApplicationContext.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    @Bean
    public void getMileage() {
        System.out.println("50kmpl");
    }
    @Bean
    public void getPrice() {
        System.out.println("Rs: 1,60,000");
    }
}
