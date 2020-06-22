package com.axce1_.javacore.oop.factory;

public class TriangleFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new TriangleFigure();
    }
}
