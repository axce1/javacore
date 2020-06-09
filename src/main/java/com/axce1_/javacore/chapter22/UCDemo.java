package com.axce1_.javacore.chapter22;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UCDemo {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp = new URL("https://ya.ru");
        URLConnection hpCon = hp.openConnection();
        long d = hpCon.getDate();
        d = hpCon.getLastModified();
    }
}
