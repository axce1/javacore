package com.axce1_.javacore.chapter05;

public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        while(++i < --j);
        System.out.println("avg i equal " + i);
    }
}
