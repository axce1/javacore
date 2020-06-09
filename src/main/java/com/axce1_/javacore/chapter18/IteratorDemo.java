package com.axce1_.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String el = itr.next();
            System.out.println(el + " ");
        }

        System.out.println();

        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String el = litr.next();
            litr.set(el + "+");
        }

        itr = al.iterator();
        while (itr.hasNext()) {
            String el = itr.next();
            System.out.println(el + " ");
        }

        while (litr.hasPrevious()) {
            String el = litr.previous();
            litr.set(el + "+");
        }

        System.out.println();
    }
}
