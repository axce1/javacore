package com.axce1_.javacore.oop.proxy;

public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading... " + url);
    }

    @Override
    public void run() {
        System.out.println("running project " + url);
    }
}
