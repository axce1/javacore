package com.axce1_.javacore.chapter11;

class NewThread3 implements Runnable {
    Thread t;
    String name;

    NewThread3(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("demo thread " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i=5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("demo thread stoped");
    }
}

public class DemoJoin {
    public static void main(String[] args) {
        NewThread3 ob1 = new NewThread3("one");
        NewThread3 ob2 = new NewThread3("two");
        NewThread3 ob3 = new NewThread3("three");

        System.out.println(ob1.t.isAlive());
        System.out.println(ob2.t.isAlive());
        System.out.println(ob3.t.isAlive());

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(ob1.t.isAlive());
        System.out.println(ob2.t.isAlive());
        System.out.println(ob3.t.isAlive());
    }
}
