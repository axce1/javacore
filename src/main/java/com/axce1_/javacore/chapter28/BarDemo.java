package com.axce1_.javacore.chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());
        System.out.println("thread start");
        new MyThread1(cb, "A");
        new MyThread1(cb, "B");
        new MyThread1(cb, "C");
    }
}

class MyThread1 implements Runnable {
    CyclicBarrier cbar;
    String name;

    MyThread1(CyclicBarrier c, String n) {
        cbar = c;
        name = n;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name);
        try {
            cbar.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class BarAction implements Runnable {

    @Override
    public void run() {
        System.out.println("barrier here");
    }
}