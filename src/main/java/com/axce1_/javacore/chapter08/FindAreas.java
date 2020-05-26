package com.axce1_.javacore.chapter08;

class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("not impliment");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }
    double area(){
        System.out.println("rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }
    double area(){
        System.out.println("triangle");
        return dim1 * dim2 / 2;
    }
}

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(1, 3);
        Triangle t = new Triangle(3, 4);

        Figure figref;
        figref = r;
        System.out.println(figref.area());
        figref = t;
        System.out.println(figref.area());
        figref = r;
        System.out.println(figref.area());
    }
}
