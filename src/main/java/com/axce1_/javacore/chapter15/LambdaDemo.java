package com.axce1_.javacore.chapter15;

import static java.lang.Math.random;

interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;

        myNum = () -> 123.45;
        System.out.println(myNum.getValue());

        myNum = () -> random() * 100;
        System.out.println(myNum.getValue());
    }
}
