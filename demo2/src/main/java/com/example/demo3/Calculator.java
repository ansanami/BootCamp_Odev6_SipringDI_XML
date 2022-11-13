package com.example.demo3;

public interface Calculator {
    void addFunction(MathFunction function);

    double doCalculation(String functionName, double arg);

    void listMathFunction();
}
