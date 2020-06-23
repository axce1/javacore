package com.axce1_.javacore.oop.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://gihub.com/user/realproject");
        project.run();
    }
}
