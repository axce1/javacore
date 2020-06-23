package com.axce1_.javacore.oop.bridge;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote: power toggle");
    }

    @Override
    public void channelDown() {
        System.out.println("Remote: channel down");
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: channel up");
    }
}
