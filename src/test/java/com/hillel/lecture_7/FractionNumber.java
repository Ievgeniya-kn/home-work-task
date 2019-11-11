package com.hillel.lecture_7;

/**
 * Created by alpa on 11/8/19
 */
public class FractionNumber {
    private long numberOne;
    private long numberTwo;

    public FractionNumber(long numberOne, long numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }


    public void setNumberOne() {
        this.numberOne = numberOne;
    }

    public void setNumberTwo() {
        this.numberTwo = numberTwo;
    }


    public long getNumberOne() {
        return numberTwo;
    }

    public long getNumberTwo() {
        return numberTwo;
    }

    public long fractionNumberPlus() {
        return this.numberOne + this.numberTwo;
    }

    public long fractionNumberMinus() {
        return this.numberOne - this.numberTwo;
    }

    public long fractionNumberMultiply() {
        return this.numberOne * this.numberTwo;
    }

    public long fractionNumberDivide() {
        if (this.numberTwo == 0) {
            System.out.println("It's forbidden to Divide to Zero!!!");
            return 0;
        } else {
            return this.numberOne / this.numberTwo;
        }
    }

    @Override
    public String toString() {
        return "FractionNumber{" +
                "numberOne=" + numberOne +
                ", numberTwo=" + numberTwo +
                '}';
    }
}
