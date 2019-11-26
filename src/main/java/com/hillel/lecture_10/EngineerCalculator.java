package com.hillel.lecture_10;

public class EngineerCalculator extends AbstractCalculator{


    public EngineerCalculator(double a, double b) {
        super(a,b);
    }

    public double sinusFunction() {
        return Math.sin(this.getA());
    }

    public double lnFunction() {
        return Math.log(this.getB());
    }

    public double cosFunction() {
        return Math.cos(this.getA());
    }

    public double powFunction() {
        return Math.pow(this.getA(),this.getB());
    }

    @Override
    public  String calculatorType() {
        return "Engineer";
    }
}
