package com.example.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;

public class CalculatorT1 implements Calculator{
    private int functionCount;
    private int currentCount;

    private MathFunction[] functions;
    private double argument;

    public CalculatorT1(int functionCount) {
            this.functionCount=functionCount;
            functions=new MathFunction[functionCount];
    }
    public void setFunctionCount(int functionCount){
        this.functionCount=functionCount;
    }
    public void setFunctions(MathFunction[] functions) {
        this.functions = functions;
    }
    public MathFunction[] getFunctions(){
        return functions;
    }
    public int getFunctionCount(){
        return functionCount;
    }

    public void setCurrentCount(int currentCount){
        this.currentCount=currentCount;
    }
    public int getCurrentCount(){
        return currentCount;
    }

    public void setFunctionCount(double argument){
        this.argument=argument;
    }
    public double getArgument(){
        return argument;
    }

    @Override
    public void addFunction(MathFunction function) {
        functions[currentCount] = function;
        currentCount++;
    }
    @Override
    public double doCalculation(String functionName, double arg) {
        double result = 0.0;
        boolean isFunctionFound = false;
        for (MathFunction function : functions) {
            if (functionName.equalsIgnoreCase(function.getName())) {
                result = function.calculate(arg);
                isFunctionFound = true;
            }
        }
        if(!isFunctionFound)
            System.out.println("No such function found!");

        return result;
    }
    @Override
    public void listMathFunction() {
        System.out.println("Available Functions:");
        for (MathFunction function : functions)
            System.out.println(function.getName());
    }


}
