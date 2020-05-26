package com.axce1_.javacore.chapter08;

class Box3 {
    double width;
    double height;
    double depth;

    Box3(Box3 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.height;
    }

    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box3() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box3(double len) {
        width =height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight3 extends Box3 {
    double weight;
    BoxWeight3(double w, double h, double d, double m) {
        super(w,h,d);
        weight = m;
    }
    BoxWeight3(BoxWeight3 ob) {
        super(ob);
        weight = ob.weight;
    }
    BoxWeight3() {
        super();
        weight = -1;
    }
    BoxWeight3(double len, double m) {
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight3 {
    double cost;
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }
    Shipment(double w, double h, double d, double m, double c) {
        super(w,h,d,m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,23,43,23,3.41);
        Shipment shipment2 = new Shipment(1,2,3,2.3,3.41);
        double vol;
        vol = shipment1.volume();
        System.out.println(vol);
        System.out.println(shipment1.cost);

        vol = shipment2.volume();
        System.out.println(vol);
        System.out.println(shipment2.cost);
    }
}
