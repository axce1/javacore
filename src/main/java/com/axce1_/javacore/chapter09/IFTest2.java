package com.axce1_.javacore.chapter09;

class DynStack implements IntStack {
    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos==stck.length-1) {
            int temp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
                stck = temp;
                stck[++tos]=item;
            }
        } else {
            stck[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if(tos<0) {
            System.out.println("stack is not load");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

public class IFTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);

        for (int i = 0; i < 12; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            mystack2.push(i);
        }

        for (int i = 0; i < 12; i++) {
            mystack1.pop();
        }
        for (int i = 0; i < 20; i++) {
            mystack2.pop();
        }
    }
}
