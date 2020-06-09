package com.axce1_.javacore.chapter02;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y) System.out.println("x less y");

        x = x * 2;
        if (x == y) System.out.println("x equal y");

        x = x * 2;
        if (x > y) System.out.println("x greath y");

        if (x == y) System.out.println("nothing");

    }
}
