package com.axce1_.javacore.chapter06;

class Box6 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    Box6 () {
        width = 10;
        height = 15;
        depth = 20;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();
        double vol;

        vol = mybox1.volume();
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);
    }
}
