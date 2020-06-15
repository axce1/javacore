package com.axce1_.javacore.chapter11;

class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " enter to method A.foo()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("class A break");
        }
        System.out.println(name + " try call method B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("B method A.last()");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " enter to method B.bar()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("class B break");
        }
        System.out.println(name + " try call method A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("B method A.last()");
    }
}

public class Deadlock implements Runnable{
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this, "non main");
        t.start();
        a.foo(b);
        System.out.println("back to main");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("back to other thread");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
