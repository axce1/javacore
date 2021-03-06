package com.axce1_.javacore.chapter08;

class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.height;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width =height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15, 34.2);
        BoxWeight mybox2 = new BoxWeight(1,2,5, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println(vol);
        System.out.println(mybox1.weight);
        vol = mybox2.volume();
        System.out.println(vol);
        System.out.println(mybox2.weight);
    }
}
