package com.axce1_.javacore.chapter28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Foo {
    public void first() {
        System.out.print("first");
    }

    public void second() {
        System.out.print("second");
    }

    public void third() {
        System.out.print("third");
    }
}

public class FirstM {
    public static void main(String[] args) {
        Foo foo = new Foo();
        ExecutorService executorService = Executors.newFixedThreadPool(3) ;
        executorService.submit(foo::first);
        executorService.submit(foo::second);
        executorService.submit(foo::third);
        executorService.shutdown();
    }
}
