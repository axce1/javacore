package com.axce1_.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class CompLastName implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        int i, j, k;

        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

class CompThenByFirstName implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}

public class TreeMapDemo2A {
    public static void main(String[] args) {

        CompLastName compLN = new CompLastName();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> tm = new TreeMap<>(compLastThenFirst);
        tm.put("Test1 test1", 3434.34);
        tm.put("Test2 test2 ", 123.00);
        tm.put("Test3 test3", 1378.00);
        tm.put("Test3 test4", 99.22);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for(Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();
        double balance = tm.get("Test1 test1");
        tm.put("Test1 test1", balance + 1111);
        System.out.println(tm.get("Test1 test1"));
    }
}
