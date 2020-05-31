package com.axce1_.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TComp implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        int i, j, k;

        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k==0)
            return aStr.compareTo(bStr);
        else
            return k;
    }
}

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>();
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
