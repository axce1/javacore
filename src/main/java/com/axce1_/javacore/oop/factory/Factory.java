package com.axce1_.javacore.oop.factory;

public class Factory {
    public static void main(String[] args) {
        FigureFactory figureFactory = figureFactoryByName("triangle");
        Figure figure = figureFactory.createFigure();
        figure.figureName();
    }

    static FigureFactory figureFactoryByName(String figure) {
        if(figure.equalsIgnoreCase("triangle")) {
            return new TriangleFactory();
        } else if (figure.equalsIgnoreCase("cycle")) {
            return new CycleFactory();
        } else {
            throw new RuntimeException("not found");
        }
    }
}
