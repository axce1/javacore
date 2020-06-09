package com.axce1_.javacore.chapter03;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 18600;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.println("Za " + days);
        System.out.println(" dnei svet proidet okolo ");
        System.out.println(distance + " miles.");
    }
}
