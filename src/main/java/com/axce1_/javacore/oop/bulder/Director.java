package com.axce1_.javacore.oop.bulder;

public class Director {
    Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    Car buildCar() {
        builder.createCar();
        builder.buildName();
        builder.buildType();
        builder.buildPrice();

        Car car = builder.getCar();
        return car;
    }
}
