package com.axce1_.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al =new ArrayList<String>();
        System.out.println(al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println(al.size());

        System.out.println(al);

        al.remove("F");
        al.remove(2);
    }
}
