package com.axce1_.javacore.chapter22;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("https://ya.ru");
        System.out.println(hp.getProtocol());
        System.out.println(hp.getHost());
    }
}
