package com.spring.DI.Xml;

public class Bike implements Vehicle {
    private DiscountService offer;
    private String brandName;

    // DI through Setter Injection
    Bike(){}
    public void setOffer(DiscountService offer) {
        this.offer = offer;
    }


    @Override
    public void getMileage() {
        System.out.println("Mileage: 50kmpl");
    }

    @Override
    public String getDiscount() {
        return "Bike: " + this.offer.getDiscount();
    }

    // Injecting literal value
    @Override
    public String getBrandName() {
        return "Brand Name: " +this.brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
