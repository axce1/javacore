package com.axce1_.javacore.chapter09;

public class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds;
        for (int i = 0; i < 12; i++) {
            mystack.push(i);
        }
        mystack = fs;
        for (int i = 0; i < 8; i++) {
            mystack.push(i);
        }
        mystack = ds;
        for (int i = 0; i < 12; i++) {
            mystack.pop();
        }
        mystack = fs;
        for (int i = 0; i < 8; i++) {
            mystack.pop();
        }
    }
}
