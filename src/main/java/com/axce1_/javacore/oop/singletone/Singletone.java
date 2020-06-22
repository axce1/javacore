package com.axce1_.javacore.oop.singletone;

public final class Singletone {
    private static Singletone instance;
    public String value;

    private Singletone(String value) {
        this.value = value;
    }

    public static Singletone getInstance(String value) {
        if(instance == null) {
            instance = new Singletone(value);
        }
        return instance;
    }
}
