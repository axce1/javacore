package com.axce1_.javacore.chapter06;

class Box7 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    Box7 (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 mybox1 = new Box7(10,15,20);
        Box7 mybox2 = new Box7(3,6,9);
        double vol;

        vol = mybox1.volume();
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);
    }
}
