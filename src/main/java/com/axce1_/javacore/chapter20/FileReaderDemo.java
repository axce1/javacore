package com.axce1_.javacore.chapter20;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("FileReaderDemo.java")) {
            int c;
            while ((c = fr.read()) != -1) System.out.println(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
