package com.axce1_.javacore.oop.factory;

public class CycleFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new CycleFigure();
    }
}
