package com.axce1_.javacore.chapter20;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "asdfasf";
        byte b[] = tmp.getBytes();

        ByteArrayInputStream inputStream1 = new ByteArrayInputStream(b);
        ByteArrayInputStream inputStream2 = new ByteArrayInputStream(b, 0 , 3);
    }
}
