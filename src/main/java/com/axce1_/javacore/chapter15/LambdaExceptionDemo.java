package com.axce1_.javacore.chapter15;

interface DoubleNumbericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("array is empty");
    }
}

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1.0, 2.0, 3.0, 4.0};
        DoubleNumbericArrayFunc average = n -> {
            double sum = 0;
            if(n.length == 0)
                throw new EmptyArrayException();
            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum/n.length;
        };
        System.out.println(average.func(values));
        System.out.println(average.func(new double[0]));
    }
}
