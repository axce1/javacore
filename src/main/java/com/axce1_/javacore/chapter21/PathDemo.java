package com.axce1_.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("examples\\test.txt");
        System.out.println("filename " + filepath.getName(1));
        System.out.println("path to filename " + filepath);
        System.out.println("absolute path to filename " + filepath.toAbsolutePath());
        System.out.println("parent directory " + filepath.getParent());

        if(Files.exists(filepath)) {
            System.out.println("file exist");
        } else {
            System.out.println("file doesnt exist");
        }

        try {
            if(Files.isHidden(filepath))
                System.out.println("file hidden");
            else
                System.out.println("file doesnt hidden");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Files.isWritable(filepath);
        System.out.println("file is writable");

        Files.isReadable(filepath);
        System.out.println("file is readable");

        try {
            BasicFileAttributes attribs = Files.readAttributes(filepath, BasicFileAttributes.class);
            if(attribs.isDirectory())
                System.out.println("directory");
            else
                System.out.println("is not directory");

            if(attribs.isRegularFile())
                System.out.println("is regular file");
            else
                System.out.println("is not regular file");

            if(attribs.isSymbolicLink())
                System.out.println("is symbol link");
            else
                System.out.println("is not symbol link");
            System.out.println(attribs.lastModifiedTime());
            System.out.println(attribs.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
