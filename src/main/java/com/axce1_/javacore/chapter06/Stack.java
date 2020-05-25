package com.axce1_.javacore.chapter06;

public class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if(tos==9) {
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
