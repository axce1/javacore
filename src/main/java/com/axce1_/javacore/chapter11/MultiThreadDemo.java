package com.axce1_.javacore.chapter11;

class NewThread2 implements Runnable {

    String name;
    Thread t;

    NewThread2(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " done");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread2("one");
        new NewThread2("two");
        new NewThread2("three");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread done");
    }
}
