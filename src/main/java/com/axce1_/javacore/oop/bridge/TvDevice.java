package com.axce1_.javacore.oop.bridge;

public class TvDevice implements Device {
    private boolean on = false;
    private int channel = 1;

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void printStatus() {
        System.out.println("TV device status");
    }
}
