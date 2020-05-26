package com.axce1_.javacore.chapter08;

abstract class Figure1 {
    double dim1;
    double dim2;

    Figure1(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle1 extends Figure1 {
    Rectangle1(double a, double b) {
        super(a, b);
    }
    double area(){
        System.out.println("rectangle");
        return dim1 * dim2;
    }
}

class Triangle1 extends Figure1 {
    Triangle1(double a, double b) {
        super(a, b);
    }
    double area(){
        System.out.println("triangle");
        return dim1 * dim2 / 2;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {
//        Figure f = new Figure(10, 10);
        Rectangle1 r = new Rectangle1(1, 3);
        Triangle1 t = new Triangle1(3, 4);

        Figure1 figref;
        figref = r;
        System.out.println(figref.area());
        figref = t;
        System.out.println(figref.area());
        figref = r;
        System.out.println(figref.area());
    }
}
