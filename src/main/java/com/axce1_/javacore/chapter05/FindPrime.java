package com.axce1_.javacore.chapter05;

public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 14;
        if(num<2) isPrime = false;
        else isPrime = true;

        for (int i = 0; i < num/i; i++) {
            if((num % i) == 0) {
                isPrime = false;
                break;
            }
            if(isPrime) System.out.println("simple");
            System.out.println("not simple");
        }
    }
}
