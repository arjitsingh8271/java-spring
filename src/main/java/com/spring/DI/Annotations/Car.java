package com.spring.DI.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

@Component
@Scope("prototype")
public class Car implements Vehicle {
    // DI
    private DiscountService offer;

//    // DI through Constructor Injection
//    @Autowired
//    Car(DiscountService offer) {
//        this.offer = offer;
//    }

//     //Qualifier through Constructor Injection
//    @Autowired
//    Car( @Qualifier("exchangeOffer") DiscountService offer) {
//        this.offer = offer;
//    }

    // DI through Setter Injection
    @Autowired
    @Qualifier("diwaliOffer")
    public void setOffer(DiscountService offer) {
        this.offer = offer;
    }


    @Override
    public void getMileage() {
        System.out.println("Mileage: 30kmpl");
    }

    public String getDiscount() {
        return "Car: " + this.offer.getDiscount();
    }

}
