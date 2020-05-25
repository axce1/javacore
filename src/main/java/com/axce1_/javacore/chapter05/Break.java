package com.axce1_.javacore.chapter05;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first : {
            second : {
                third : {
                    System.out.println("before break ");
                    if(t) break second;
                    System.out.println("no show");
                }
                System.out.println("no show");
            }
            System.out.println("after second");
        }
    }
}
