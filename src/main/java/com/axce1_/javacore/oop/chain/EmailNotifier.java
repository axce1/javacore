package com.axce1_.javacore.oop.chain;

public class EmailNotifier extends Notifier {

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using email " + message);
    }
}
