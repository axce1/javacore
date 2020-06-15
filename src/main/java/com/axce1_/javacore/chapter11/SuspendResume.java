package com.axce1_.javacore.chapter11;

class NewThread4 implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    public NewThread4(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("new thread: " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(200);
                synchronized (this) {
                    while(suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " done");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}


public class SuspendResume {
    public static void main(String[] args) {
        NewThread4 ob1 = new NewThread4("one");
        NewThread4 ob2 = new NewThread4("two");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("thread one stop");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("thread one start again");
            ob2.mysuspend();
            System.out.println("thread two stop");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("thread one two again");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("waiting threads");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("main thread fail");
        }
        System.out.println("main thread done");
    }
}
