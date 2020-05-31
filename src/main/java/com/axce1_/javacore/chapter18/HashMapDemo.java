package com.axce1_.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("Test1 test1", 3434.34);
        hm.put("Test2 test2", 123.22);
        hm.put("Test3 test3", 1378.00);
        hm.put("Test4 test4", -19.08);

        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for(Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        System.out.println();
        double balance = hm.get("Test1 test1");
        hm.put("Test1 test1", balance + 1111);
        System.out.println(hm.get("Test1 test1"));
    }
}
