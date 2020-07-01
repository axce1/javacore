package com.axce1_.javacore.oop.State;

public class DevDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();
        developer.setActivity(activity);
        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
