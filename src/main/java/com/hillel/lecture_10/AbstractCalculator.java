package com.hillel.lecture_10;

public abstract class AbstractCalculator {

    private double a,b;

    public AbstractCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double plus(){
        return a+b;
    };

    public  double minus() {
        return a-b;
    }

    public  double multiplication() {
        return a*b;
    }

    public double division() {
        if (b==0) {
            System.out.println("Division by Zero is impossible!!!");
            return 0;
        } else return a/b;
    }

    public abstract String calculatorType();
}
