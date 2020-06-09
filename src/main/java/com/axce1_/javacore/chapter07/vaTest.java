package com.axce1_.javacore.chapter07;

public class vaTest {
    static void vaTest(int ... v) {
        System.out.println(v.length);
        for(int x : v) {
            System.out.println(x);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}
