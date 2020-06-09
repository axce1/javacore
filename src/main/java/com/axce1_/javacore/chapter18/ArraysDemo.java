package com.axce1_.javacore.chapter18;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }
        System.out.println();
        display(array);

        Arrays.sort(array);
        display(array);

        Arrays.fill(array, 2, 5, -1);
        display(array);

        Arrays.sort(array);
        display(array);

        int idx = Arrays.binarySearch(array, -9);
        System.out.println(idx);

    }

    static void display(int array[]) {
        for (int i :
                array) {
            System.out.println(i + " ");
            System.out.println();
        }
    }
}
