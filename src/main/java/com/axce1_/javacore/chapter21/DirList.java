package com.axce1_.javacore.chapter21;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "\\mydir";

        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {

            @Override
            public boolean accept(Path filename) throws IOException {
                if(Files.isWritable(filename)) return true;
                return false;
            }
        };

        try (DirectoryStream<Path> dirstrm =Files.newDirectoryStream(Paths.get(dirname), how)) {
            System.out.println(dirname);
            for (Path entry :
                    dirstrm) {
                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);
                if(attribs.isDirectory())
                    System.out.println("<DIR> ");
                else
                    System.out.println("   ");
                System.out.println(entry.getName(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
