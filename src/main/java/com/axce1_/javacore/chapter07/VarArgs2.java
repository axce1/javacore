package com.axce1_.javacore.chapter07;

public class VarArgs2 {
    static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        for(int x : v) {
            System.out.println(x);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest("one",10);
        vaTest("two",1,2,3);
        vaTest("three");
    }
}
