package com.axce1_.javacore.chapter11;

class NewThread1 extends Thread {

    NewThread1() {
        super("demo thread");
        System.out.println("demo thread " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i=5; i > 0; i--) {
                System.out.println("thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("demo thread stoped");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread();

        try {
            for (int i=5; i>0; i--) {
                System.out.println("main thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread done");
    }
}
