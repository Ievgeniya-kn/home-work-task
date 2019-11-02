package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {
        double result = 0.0;
//        TODO implement formula 9

        result = 1.1d * Math.pow(Math.E, -x) +
                Math.abs(Math.cos(Math.sqrt(Math.PI * x))) -
                3d / 8d;
        return result;
    }

    @Step
    public double calculate10Formula(double x) {
        double result = 0.0;
//        TODO implement formula 10
        result = Math.sqrt(Math.sin(Math.abs(x))) /
                3 * Math.pow(Math.pow(Math.E, 0.12d * x), 1d / 3d);
        return result;
    }

    @Step
    public double calculate11Formula(double x) {
        double result = 0.0;
//        TODO implement formula 11
        result = 2 * Math.PI * x -
                Math.abs(Math.sin(Math.sqrt(10.5d * x))) /
                        (Math.pow(x * x, 1d / 3d) + 1d / 7d);
        return result;
    }

    @Step
    public double calculate12Formula(double x) {
        double result = 0.0;
//        TODO implement formula 12
        result = Math.log(Math.sqrt(Math.abs(2 - x)) + 1.2d) /
                (2 + Math.pow(Math.E, -x)) +
                Math.pow(2d / x, 1d / 3d);
        return result;
    }

    @Step
    public double calculate13Formula(double x) {
        double result = 0.0;
//        TODO implement formula 13


        //Correct implementtion of formula 13

        result = Math.pow(Math.pow(Math.E, -2 + x), (1d / 5)) / Math.sqrt(Math.pow(x, 2) + Math.pow(x, 4) +
                Math.log(Math.abs(x - 3.14d)));


//        TODO implement formula 13
        return result;
    }
}
