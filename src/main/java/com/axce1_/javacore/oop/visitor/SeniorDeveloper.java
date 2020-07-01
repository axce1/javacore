package com.axce1_.javacore.oop.visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("writing class");
    }

    @Override
    public void create(Database database) {
        System.out.println("create database");
    }

    @Override
    public void create(Test test) {
        System.out.println("create test");
    }
}
