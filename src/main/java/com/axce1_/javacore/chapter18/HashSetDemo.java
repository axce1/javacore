package com.axce1_.javacore.chapter18;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("beta");
        hs.add("alpha");
        hs.add("gamma");
        hs.add("omega");

        System.out.println(hs);
    }
}
