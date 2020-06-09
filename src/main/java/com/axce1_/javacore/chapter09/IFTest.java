package com.axce1_.javacore.chapter09;

class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos==stck.length-1) {
            System.out.println("stack full");
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

class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

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
