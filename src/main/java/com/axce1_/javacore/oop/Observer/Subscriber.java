package com.axce1_.javacore.oop.Observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacansies) {
        System.out.println("Dear " + name + "We have some vacancies: " + vacansies + "\n====\n");
    }
}
