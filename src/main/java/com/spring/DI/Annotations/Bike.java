package com.spring.DI.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    // DI through Field Injection
    @Autowired
    @Qualifier("exchangeOffer")
    private DiscountService offer;

    @Override
    public void getMileage() {
        System.out.println("Mileage: 50kmpl");
    }

    @Override
    public String getDiscount() {
        return "Bike: " + this.offer.getDiscount();
    }

}
