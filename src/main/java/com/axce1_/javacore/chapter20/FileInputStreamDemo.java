package com.axce1_.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try (FileInputStream f = new FileInputStream("FileInputStreamDemo.java")){
            System.out.println(size=f.available());
            int n = size/40;

            System.out.println("первые " + n + " байтов, " + "прочитаны через read");
            for (int i = 0; i < n; i++) {
                System.out.println((char) f.read());
            }
            System.out.println("доступно " + f.available());

            byte b[] = new byte[n];
            if (f.read(b) != n) {
                System.out.println("нелья прочитать " + n + " байтов");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("доступно " + (size = f.available()));

            System.out.println("пропустить половину через skip");
            f.skip(size/2);
            System.out.println("доступно " + f.available());

            System.out.println("чтение " + n/2 + " байтов через массив");
            if (f.read(b, n/2, n/2) != n/2) {
                System.out.println("нельзя прочитать " + n/2 + " байтов");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println(f.available());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
