package com.axce1_.javacore.chapter28;

import java.util.concurrent.Phaser;

class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }

    protected boolean onAdvance(int p, int regParties) {
        System.out.println("phase " + p + " done");
        if(p == numPhases || regParties == 0) return true;
        return false;
    }
}

public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1, 4);
        new MyThread2(phsr, "A");
        new MyThread2(phsr, "B");
        new MyThread2(phsr, "C");

        while(!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }
        System.out.println("phaser done");
    }
}
