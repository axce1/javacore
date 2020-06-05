package com.axce1_.javacore.chapter20;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Эти данные должны быть выведены в массив";
        byte buf[] = s.getBytes();

        try {
            f.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println();
        System.out.println(f.toString());

        byte b[] = f.toByteArray();
        for (int i = 0; i < b.length; i++) {
            System.out.println((char) b[i]);
        }

        try (FileOutputStream f2 = new FileOutputStream("test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("в исходное состояние");
        f.reset();
        for (int i = 0; i < 3; i++) {
            f.write('X');
        }
        System.out.println(f.toString());
    }
}
