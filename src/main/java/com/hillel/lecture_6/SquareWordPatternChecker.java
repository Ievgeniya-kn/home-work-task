package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {

//        TODO implements result
        String result = word;
        String words1 = word;

        for (int i = 1; i <  word.length(); i++) {
            words1 = words1.substring(1) + words1.substring(0,1);
            result = result + ", "+ words1;
        }

        return result;
    }


}
