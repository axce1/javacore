package com.axce1_.javacore.oop.bulder;

public class CarManualBuilder extends Builder {
    @Override
    void buildName() {
        car.setName("car-manual");
    }

    @Override
    void buildType() {
        car.setType("manual");
    }

    @Override
    void buildPrice() {
        car.setPrice(100L);
    }
}
