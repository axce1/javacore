package com.axce1_.javacore.oop.bulder;

public class CarAutoBuilder extends Builder {
    @Override
    void buildName() {
        car.setName("track-auto");
    }

    @Override
    void buildType() {
        car.setType("auto");
    }

    @Override
    void buildPrice() {
        car.setPrice(100500L);
    }
}
