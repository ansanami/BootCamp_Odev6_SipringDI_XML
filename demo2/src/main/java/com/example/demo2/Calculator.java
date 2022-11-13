package com.example.demo2;

public interface Calculator {
    void addFunction(MathFunction function);

    double doCalculation(String functionName, double arg);

    void listMathFunction();
}
