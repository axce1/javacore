package com.axce1_.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File file, String s) {
        return s.endsWith(ext);
    }
}

public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "/tmp/java";
        File fl = new File(dirname);
        FilenameFilter only = new OnlyExt("html");
        String s[] = fl.list(only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
