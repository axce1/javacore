package com.axce1_.javacore.oop.Strategy;

public class DevRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
