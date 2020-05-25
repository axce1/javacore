package com.axce1_.javacore.chapter03;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        if(b) System.out.println("running....");
        b = false;
        if(b) System.out.println("not running....");

        System.out.println("10 > 9 equal " + (10 > 9));
    }
}
