package com.spring.DI.Annotations;

import org.springframework.stereotype.Component;

@Component
public class DiwaliOffer implements DiscountService {
    @Override
    public String getDiscount() {
        return "Diwali Offer 5% Discount!";
    }
}
