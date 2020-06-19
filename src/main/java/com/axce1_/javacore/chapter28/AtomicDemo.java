package com.axce1_.javacore.chapter28;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}

class Shared3 {
    static AtomicInteger ai = new AtomicInteger(0);
}

class AtomThread implements Runnable {
    String name;
    AtomThread(String n) {
        name = n;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Start thread " + name);
        for (int i = 0; i <= 3; i++) {
            System.out.println("thread " + name + " get: " + Shared3.ai.getAndSet(i));
        }
    }
}
