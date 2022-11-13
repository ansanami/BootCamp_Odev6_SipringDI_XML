package com.example.demo2;

public class LogFunction implements MathFunction{


    public String getName() {
        return "Log";
    }

    public double calculate(double arg) {

        return Math.log(arg);
    }
}
