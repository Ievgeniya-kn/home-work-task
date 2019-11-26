package com.hillel.lecture_10;

public class AccounterCalculator extends AbstractCalculator {

    public double persentage() {
        return ((this.getA() * this.getB()) / 100);
    }



    public AccounterCalculator(double a, double b) {
        super(a, b);
    }

    @Override
    public  String calculatorType() {
        return "Accounter";
    }

}
