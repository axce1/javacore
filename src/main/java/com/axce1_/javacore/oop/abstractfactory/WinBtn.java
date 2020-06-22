package com.axce1_.javacore.oop.abstractfactory;

public class WinBtn implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
