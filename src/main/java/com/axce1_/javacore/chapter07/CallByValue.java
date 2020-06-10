package com.axce1_.javacore.chapter07;

class Test1 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a = 15, b = 20;
        System.out.println("a & b before call " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a & b after call " + a + " " + b);
    }
}
