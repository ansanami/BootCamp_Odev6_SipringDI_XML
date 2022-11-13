package com.example.demo2;

public class SquaredFunction implements MathFunction{

    @Override
    public String getName() {
        return "Squared";
    }

    @Override
    public double calculate(double arg1) {

        return Math.sqrt(arg1);
    }
}
