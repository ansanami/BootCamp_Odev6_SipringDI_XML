package com.example.demo2;

public class CosFunction implements MathFunction {
@Override
    public String getName() {
        return "Cos";
    }
@Override
    public double calculate(double arg) {
        return Math.cos(arg);
    }
}
