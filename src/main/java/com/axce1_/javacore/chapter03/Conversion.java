package com.axce1_.javacore.chapter03;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nCast type int to type byte");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);

        System.out.println("\nCast type double to type int");
        i = (int) d;
        System.out.println("i and d " + i + " " + d);

        System.out.println("\nCast type double to type byte");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }
}
