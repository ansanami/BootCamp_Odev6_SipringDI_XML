package com.example.demo2;

public class Cube implements MathFunction {

    @Override
    public String getName() {

        return "Cube";
    }

    @Override
    public double calculate(double arg) {

        return arg*arg*arg;
    }
}
