package com.axce1_.javacore.chapter20;

import java.io.File;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("/tmp/COPYRIGHT");
        p(f1.getPath());
        p(f1.getAbsolutePath());
        p(f1.getPath());
        p(f1.exists() ? "exist" : "not exist");
        p(f1.canWrite() ? "can write" : "can not write");
        p(f1.isDirectory() ? "true" : "false");
        p(f1.isFile() ? "true" : "false");
        p(f1.isAbsolute() ? "true" : "false");
        p(String.valueOf(f1.lastModified()));
        p(String.valueOf(f1.length()));
    }
}
