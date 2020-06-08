package com.axce1_.javacore.chapter15;

interface NumericTest {
    boolean test(int n);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n -> (n % 2) == 0);
        if(isEven.test(10)) System.out.println("even");
        if(!isEven.test(9)) System.out.println("not even");

        NumericTest isNonNeg = n -> n >= 0;
        if(isEven.test(1)) System.out.println("even");
        if(!isEven.test(-1)) System.out.println("not even");
    }
}
