package com.axce1_.javacore.oop.adapter;

public class Adapter extends RoundPeg {
    private SquarePeg peg;

    public Adapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth()/2),2)*2));
        return result;
    }
}
