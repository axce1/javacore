package com.axce1_.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(28);
        ll.add(-28);
        ll.add(8);

        Comparator<Integer> reverseOrder = Collections.reverseOrder();
        Collections.sort(ll, reverseOrder);

        for (int i :
                ll) {
            System.out.println(i + " ");
        }

        System.out.println();

        Collections.shuffle(ll);
        for (int i :
                ll) {
            System.out.println(i + " ");
        }

        System.out.println(Collections.min(ll));
        System.out.println(Collections.max(ll));
    }
}
