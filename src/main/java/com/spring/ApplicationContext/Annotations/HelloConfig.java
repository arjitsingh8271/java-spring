package com.spring.ApplicationContext.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Public accessor method, constructor, equals, hashcode & toString are automatically created by record
record Person (String name, int age) {};
record Address (String city, int pinCode, String State) {};

@Configuration
public class HelloConfig {
    @Bean
    public String name() {
        return "Arjit";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Person student() {
        return new Person("Amit", 23);
    }

    @Bean ("Add")   // Custom name for Bean
    public Address address() {
        return new Address("Dhanbad", 80001, "Jharkhand");
    }

    @Bean
    public Person personMethodCall() {
        return new Person(name(), age());
    }

    @Bean
    public Person personParameters(String name, int age) {
        return new Person(name, age);
    }
}
