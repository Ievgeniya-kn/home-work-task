package com.hillel.lecture_10;

public class SimpleCalculator extends AbstractCalculator {

    public SimpleCalculator(double a, double b) {
        super(a, b);
    }

    public String calculatorType() {
        return "Simple";
    }

}
