package com.axce1_.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

public class DirTreeList {
    public static void main(String[] args) {
        String dirname = "\\mydir";
        System.out.println(dirname);
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
