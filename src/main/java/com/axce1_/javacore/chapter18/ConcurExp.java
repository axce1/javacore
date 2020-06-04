package com.axce1_.javacore.chapter18;

import java.util.ArrayList;
import java.util.List;

public class ConcurExp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer integer: list) {
            list.remove(1);
        }
    }
}
