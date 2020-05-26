package com.axce1_.javacore.chapter09.p1;

class Derived extends Protection{
    Derived() {
        System.out.println("constractor subbase class");
        System.out.println("n = " + n);
//        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
