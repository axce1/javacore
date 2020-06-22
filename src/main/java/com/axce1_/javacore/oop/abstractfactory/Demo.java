package com.axce1_.javacore.oop.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        Application app;

        app = new Application(new LinuxFactory());
        app.paint();
    }
}
