package com.axce1_.javacore.chapter07;

public class VarArgs3 {
    static void vaTest(int ... v) {
        System.out.println(v.length);
        for(int x : v) {
            System.out.println(x);
            System.out.println();
        }
    }

    static void vaTest(boolean ... v) {
        System.out.println(v.length);
        for(boolean x : v) {
            System.out.println(x);
            System.out.println();
        }
    }
    static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        for(int x : v) {
            System.out.println(x);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(10,3,34);
        vaTest("two",1,2,3);
        vaTest(true, false,false,true);
    }
}

