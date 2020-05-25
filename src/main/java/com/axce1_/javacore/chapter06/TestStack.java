package com.axce1_.javacore.chapter06;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }

        for (int i = 0; i < 20; i++) {
            mystack2.push(i);
        }

        for (int i = 0; i < 10; i++) {
            mystack1.pop();
        }

        for (int i = 0; i < 20; i++) {
            mystack2.pop();
        }

    }
}
