package com.axce1_.javacore.chapter03;

public class LifeTime {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 3; i++) {
            int y = -1;
            System.out.println("y equal: " + y);
            y = 100;
            System.out.println("now y equal: " + y);
        }
    }
}
