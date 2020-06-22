package com.axce1_.javacore.oop.bulder;

public class CarBuildRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new CarAutoBuilder());
        Car car = director.buildCar();
        System.out.println(car);
    }
}
