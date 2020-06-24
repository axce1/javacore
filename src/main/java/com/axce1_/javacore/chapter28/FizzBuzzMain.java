package com.axce1_.javacore.chapter28;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

class FizzBuzz {
    int n;
    int cur;
    private final Semaphore fz, bz, fbz, num;

    public FizzBuzz(int n) {
        this.n = n;
        this.fz = new Semaphore(0, true);
        this.bz = new Semaphore(0, true);
        this.fbz = new Semaphore(0, true);
        this.num = new Semaphore(1, true);
    }

    public void fizz(Runnable printFizz) throws InterruptedException {
        for (int i=1; i<=this.n; i++) {
            if (i%3 == 0 ) {
                this.fz.acquire();
                printFizz.run();
                this.cur++;
                System.out.println(i);
                this.release();
            }
        }
    }

    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (int i=1; i<=this.n; i++) {
            if (i%5 == 0) {
                this.bz.acquire();
                printBuzz.run();
                this.cur++;
                this.release();
            }
        }
    }

    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (int i=1; i<=this.n; i++) {
            if (i%5 == 0 && i %3 == 0) {
                this.bz.acquire();
                printFizzBuzz.run();
                this.cur++;
                this.release();
            }
        }
    }

    public void number(IntConsumer printNumber) throws InterruptedException {
        for (int i=1; i<=this.n; i++) {
            if (i%3 != 0 && i %5 != 0) {
                this.num.acquire();
                printNumber.accept(i);
                this.cur++;
                this.release();
            }
        }
    }

    private void release() {
        if(this.cur % 3 == 0) {
            this.fz.release();
        } else if (this.cur % 5 == 0){
            this.bz.release();
        } else if (this.cur % 5 == 0 && this.cur % 3 == 0) {
            this.fbz.release();
        } else {
            this.num.release();
        }
    }
}

public class FizzBuzzMain {
    public static void main(String[] args) throws InterruptedException {
        FizzBuzz fz = new FizzBuzz(15);
        fz.fizz(() -> System.out.println("wer"));
        fz.buzz(() -> System.out.println("w2er"));
        fz.fizzbuzz(() -> System.out.println("we23r"));
        IntConsumer d = null;
        fz.number(d);
    }
}
