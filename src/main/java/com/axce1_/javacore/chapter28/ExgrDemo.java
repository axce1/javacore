package com.axce1_.javacore.chapter28;

import java.util.concurrent.Exchanger;

public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String>  exrg = new Exchanger<String>();
        new UseString(exrg);
        new MakeString(exrg);
    }
}

class MakeString implements Runnable {
    Exchanger<String> ex;
    String str;

    MakeString(Exchanger<String> c) {
        ex = c;
        str = new String();
        new Thread(this).start();
    }

    @Override
    public void run() {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; i++) {
                str += (char) ch++;
            }
            try {
                str = ex.exchange(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class UseString implements Runnable {
    Exchanger<String> ex;
    String str;

    UseString(Exchanger<String> c) {
        ex = c;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                str = ex.exchange(new String());
                System.out.println("got " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}