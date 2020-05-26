package com.axce1_.javacore.chapter08;

class A2 {
    int i;
}

class B2 extends A2 {
    int i;
    B2(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println(super.i);
        System.out.println(i);
    }
}

public class UserSuper {
    public static void main(String[] args) {
        B2 subOb = new B2(1,2);
        subOb.show();
    }
}
