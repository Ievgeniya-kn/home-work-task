package com.hillel.lecture_10;

public class FinanceCalculator extends AbstractCalculator {
    int periodDeposit;

    public FinanceCalculator(double a, double b, int periodDeposit) {
        super(a, b);
        this.periodDeposit = periodDeposit;
    }


    public double monthlyRent() {
        return (this.getA() * this.getB()) / (12 * 100);
    }

    public double totalDeposit() {
        return (this.getB() * (1 + (periodDeposit / 365) * (this.getB() / 100)));
    }

    @Override
    public  String calculatorType() {
        return "Finance";
    }
}
