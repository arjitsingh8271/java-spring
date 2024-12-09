package com.spring.ApplicationContext.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Bean
    public void getMileage() {
        System.out.println("20kmpl");
    }

}
