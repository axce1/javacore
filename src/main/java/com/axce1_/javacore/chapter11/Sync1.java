package com.axce1_.javacore.chapter11;

class Callme1 {
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}

class Caller1 implements Runnable {
    String msg;
    Callme1 target;
    Thread t;

    public Caller1(Callme1 tgt, String s) {
        target = tgt;
        msg = s;
        t = new Thread(this);
        t.start();

    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}

public class Sync1 {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "welcome");
        Caller ob2 = new Caller(target, "synchronized");
        Caller ob3 = new Caller(target, "world!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
