package com.spring.DI.Annotations;

import org.springframework.stereotype.Component;

@Component
public class ExchangeOffer implements DiscountService{
    @Override
    public String getDiscount() {
        return "Exchange offer 15% Discount!";
    }
}
