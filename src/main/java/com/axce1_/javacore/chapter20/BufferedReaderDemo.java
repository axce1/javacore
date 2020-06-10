package com.axce1_.javacore.chapter20;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String s = "это знак авторского права &copy;, a &copy - нет.\n";
        char buf[] = new char[s.length()];
        CharArrayReader in = new CharArrayReader(buf);
        int c;
        boolean marked = false;

        try (BufferedReader f = new BufferedReader(in)){
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '&':
                        if(!marked) {
                            f.mark(32);
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if(marked) {
                            marked = false;
                            System.out.println("(c)");
                        } else {
                            System.out.println((char) c);
                        }
                        break;
                    case ' ':
                        if(marked) {
                            marked = false;
                            f.reset();
                            System.out.println("&");
                        } else {
                            System.out.println((char) c);
                        }
                        break;
                    default:
                        if(!marked)
                            System.out.println((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
