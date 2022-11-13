package com.example.demo3;

public class FiboniacciFunction implements MathFunction {

    @Override
    public String getName() {

        return "Fiboniacci";
    }

    @Override
    public double calculate(double arg) {
        if(arg == 0) {
            return 0;
        }
        else if(arg == 1) {
            return 1;
        }
        else if(arg<0) {
            System.out.println("Fiboniacci negatif deger alamaz");
            return -1;
        }
        else
            return calculate(arg - 1) + calculate(arg - 2);
    }

}
