package com.axce1_.javacore.oop.bulder;

public abstract class Builder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildName();
    abstract void buildType();
    abstract void buildPrice();

    Car getCar() {
        return car;
    }
}
