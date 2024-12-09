package com.spring.DI.Xml;

public class Cycle {
//    // Without Injecting reference
//    private DiwaliOffer offer = new DiwaliOffer();
//
//    public void getOffer() {
//        offer.getDiscountOnCycle();
//    }

    // With Injecting reference
    private DiwaliOffer cycleOffer;

    public void setCycleOffer(DiwaliOffer cycleOffer) {
        this.cycleOffer = cycleOffer;
    }

    public void getOffer() {
        System.out.println("Cycle: " +cycleOffer.getDiscountOnCycle());
    }

}
