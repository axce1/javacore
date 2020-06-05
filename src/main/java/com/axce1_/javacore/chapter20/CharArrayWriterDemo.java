package com.axce1_.javacore.chapter20;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "эти данные должны быть выведены в массив";
        char buf[] = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);
        try {
            f.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("буффер в виде нормальной строки");
        System.out.println(f.toString());
        System.out.println("to array");
        char c[] = f.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        System.out.println("\nВ поток типа FileWriter() ");
        try(FileWriter f2 = new FileWriter("test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("to init state");
        f.reset();
        for (int i = 0; i < 3; i++) {
            f.write('X');
        }
        System.out.println(f.toString());
    }
}
