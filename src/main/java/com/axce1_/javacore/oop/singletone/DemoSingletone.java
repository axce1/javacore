package com.axce1_.javacore.oop.singletone;

public class DemoSingletone {
    public static void main(String[] args) {
        Singletone fooSingletone = Singletone.getInstance("Foo");
        Singletone barSingletone = Singletone.getInstance("Bar");
        System.out.println(fooSingletone.value);
        System.out.println(barSingletone.value);
    }
}
