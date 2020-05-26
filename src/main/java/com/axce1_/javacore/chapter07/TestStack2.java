package com.axce1_.javacore.chapter07;

class Stack2 {
    private int stck[];
    private int tos;

    Stack2(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if(tos==stck.length-1) {
            System.out.println("stack is full");
        } else {
            stck[++tos] = item;
        };
    }

    int pop() {
        if(tos < 0) {
            System.out.printf("Stack is not load");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }
}

public class TestStack2 {
    public static void main(String[] args) {
        Stack2 mystack1 = new Stack2(5);
        Stack2 mystack2 = new Stack2(8);

        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mystack2.push(i);
        }
        for (int i = 0; i < 5; i++) {
            mystack1.pop();
        }
        for (int i = 0; i < 8; i++) {
            mystack2.pop();
        }


    }
}
