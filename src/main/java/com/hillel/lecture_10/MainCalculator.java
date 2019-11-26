package com.hillel.lecture_10;

public class MainCalculator {

    public static void main(String[] args) {
        double a = 3d;
        double b = 5d;

        AccounterCalculator accounterCalculator = new AccounterCalculator(a, b);
        System.out.println(String.format("%f  + %f =%f",a,b,accounterCalculator.plus()));
        System.out.println(String.format("%f  - %f =%f",a,b,accounterCalculator.plus()));
        System.out.println(String.format("%f  * %f =%f",a,b,accounterCalculator.minus()));
        System.out.println(String.format("%f  / %f =%f",a,b,accounterCalculator.persentage()));
        System.out.println(accounterCalculator.calculatorType());
    }


}
