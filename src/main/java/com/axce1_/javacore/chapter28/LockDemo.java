package com.axce1_.javacore.chapter28;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new LockThread(lock, "A");
        new LockThread(lock, "B");
    }
}

class Shared1 {
    static int count = 0;
}

class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    public LockThread(ReentrantLock lk, String n) {
        name = n;
        lock = lk;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("thread start " + name);
        try {
            System.out.println("thread " + name + " waiting lock counter");
            lock.lock();
            System.out.println("thread " + name + " lock counter");
            Shared1.count++;
            System.out.println("thread " + name + ": " + Shared1.count);
            System.out.println("thread " + name + " waiting");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("thread " + name + " unlock count");
            lock.unlock();
        }
    }
}
