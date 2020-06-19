package com.axce1_.javacore.chapter28;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;
        System.out.println("thread start");
        new MyThread2(phsr, "A");
        new MyThread2(phsr, "B");
        new MyThread2(phsr, "C");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("phase " + curPhase + " done");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("phase " + curPhase + " done");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("phase " + curPhase + " done");

        phsr.arriveAndDeregister();
        if(phsr.isTerminated()) {
            System.out.println("phaser done");
        }
    }
}

class MyThread2 implements Runnable {

    Phaser phsr;
    String name;

    MyThread2(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("thread " + name + " start first phase");
        phsr.arriveAndAwaitAdvance();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("thread " + name + " start second phase");
        phsr.arriveAndAwaitAdvance();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("thread " + name + " start three phase");
        phsr.arriveAndDeregister();
    }
}
