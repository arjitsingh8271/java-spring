package com.spring.DI.Xml;

public class DiwaliOffer implements DiscountService {

    public String getDiscount() {
        return "Diwali Offer 5% Discount!";
    }

    public String getDiscountOnCycle() {
        return "No Discount.";
    }

}
