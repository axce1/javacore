package com.axce1_.javacore.chapter08;

abstract class A7{
    abstract void callme();
    void callmetoo() {
        System.out.println("this is method");
    }
}

class B7 extends A7 {
    void callme() {
        System.out.println("callme() from B");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B7 b = new B7();
        b.callme();
        b.callmetoo();
    }
}
