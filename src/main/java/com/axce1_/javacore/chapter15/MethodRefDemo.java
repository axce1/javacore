package com.axce1_.javacore.chapter15;

interface StringFunc2 {
    String func(String n);
}

class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        int i;
        for(i=0; i<str.length(); i++) {
            if (str.charAt(i) != ' ')
                result += str.charAt(i);
        }
        return result;
    }
}

class MethodRefDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "this is string";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println(inStr);
        System.out.println(outStr);
    }
}