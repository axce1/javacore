package com.axce1_.javacore.chapter09;

public interface IntStack {
    void push(int item);
    int pop();
    default void clear() {
        System.out.println("no clear() method");
    }
}
