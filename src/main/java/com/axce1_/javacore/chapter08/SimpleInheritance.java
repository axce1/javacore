package com.axce1_.javacore.chapter08;

class A {
    int i, j;

    void showij() {
        System.out.println(i + " " + j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println(k);
    }

    void sum() {
        System.out.println(i + j + k);
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 7;
        subOb.k = 7;
        subOb.showij();
        subOb.showk();
        System.out.println();
        subOb.sum();
    }
}
