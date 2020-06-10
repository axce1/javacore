package com.axce1_.javacore.chapter08;

class A3{
    A3(){
        System.out.println("B in A");
    }
}

class B3 extends A3{
    B3() {
        System.out.println("B in B");
    }
}

class C3 extends B3 {
    C3() {
        System.out.println("B in C");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C3 c = new C3();
    }
}
