package com.spring.DI.Xml;

public class Car implements Vehicle {
    private DiscountService offer;
    private String brandName;

    // DI through Constructor Injection
    Car(DiscountService offer) {
        this.offer = offer;
    }

    // DI through Setter Injection
    Car(){}
    public void setOffer(DiscountService offer) {
        this.offer = offer;
    }


    @Override
    public void getMileage() {
        System.out.println("Mileage: 30kmpl");
    }

    @Override
    public String getDiscount() {
        return "Car: " + this.offer.getDiscount();
    }

    @Override
    public String getBrandName() {
        return "Brand Name: " +this.brandName;
    }

    // Injecting literal value
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
