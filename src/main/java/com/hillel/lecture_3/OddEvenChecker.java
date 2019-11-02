package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class OddEvenChecker {

    @Step
    public String checkNumber(int number) {

//        TODO implements result
        String result = "";int diff;

        diff=number % 2;

        if (diff != 0)
            result = "Odd Number";
        else
            result = "Even Number";



        return result;
    }
}
