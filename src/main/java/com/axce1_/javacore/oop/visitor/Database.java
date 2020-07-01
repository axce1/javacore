package com.axce1_.javacore.oop.visitor;

public class Database implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
