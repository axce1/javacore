package com.axce1_.javacore.chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println("current thread " + thread);

        thread.setName("my thread");
        System.out.println("renamed thread " + thread);

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
