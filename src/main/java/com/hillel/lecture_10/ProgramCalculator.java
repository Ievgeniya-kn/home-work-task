package com.hillel.lecture_10;

public class ProgramCalculator extends AbstractCalculator {

    public ProgramCalculator(double a, double b) {
        super(a, b);
    }

    public double squareOfCircle() {
        return 2*Math.PI*Math.pow(this.getA(),2);
    }

    public double squareOfTriangle() {
        return (this.getA()*this.getB())/2;
    }

    @Override
    public String calculatorType() {
        return "Program";
    }
}
