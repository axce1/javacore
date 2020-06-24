package com.axce1_.javacore.chapter28;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

class FizzBuzz1 {
    private final Semaphore fs, bs, fbs, ns;
    private final int n;
    private Boolean flag = false;

    public FizzBuzz1(int n) {
        this.n = n;
        this.fs = new Semaphore(0);
        this.bs = new Semaphore(0);
        this.fbs = new Semaphore(0);
        this.ns = new Semaphore(1);
    }

    public void fizz(Runnable printFizz) throws InterruptedException {
        while (true) {
            fs.acquire();
            if(flag && fs.availablePermits() == 0)break;
            printFizz.run();
            ns.release();
        }
    }

    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (true) {
            bs.acquire();
            if(flag && bs.availablePermits() == 0)break;
            printBuzz.run();
            ns.release();
        }
    }


    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (true) {
            fbs.acquire();
            if(flag && fbs.availablePermits() == 0)break;
            printFizzBuzz.run();
            ns.release();
        }
    }

    public void number(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            ns.acquire();
            if(i%15 == 0) {
                fbs.release();
            }
            else if(i%3 == 0 && i%5 !=0) {
                fs.release();
            }
            else if(i%5 == 0 && i%3 != 0) {
                bs.release();
            }
            else {
                printNumber.accept(i);
                ns.release();
            }
        }
        flag = true;

        fs.release();
        bs.release();
        fbs.release();
    }

}

public class FZ {
    public static void main(String[] args) throws InterruptedException {
        FizzBuzz1 fz = new FizzBuzz1(15);
        IntConsumer d = System.out::println;
        fz.number(d);
        fz.fizz(() -> System.out.println("fizz"));
        fz.buzz(() -> System.out.println("buzz"));
        fz.fizzbuzz(() -> System.out.println("fizzbuzz"));
    }
}
