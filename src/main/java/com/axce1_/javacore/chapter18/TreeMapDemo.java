package com.axce1_.javacore.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>();
        tm.put("Test1", 3434.34);
        tm.put("Test2", 123.00);
        tm.put("Test3", 1378.00);
        tm.put("Test4", 99.22);

        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for(Map.Entry<String , Double> me: set) {
            System.out.println(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance = tm.get("Test1");
        tm.put("Test1", balance + 1111);
        System.out.println(tm.get("Test1"));
    }
}
