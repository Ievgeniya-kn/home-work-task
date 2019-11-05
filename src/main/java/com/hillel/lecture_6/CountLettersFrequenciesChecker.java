package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountLettersFrequenciesChecker {


    @Step
    public String countLettersFrequencies(String text, char letter) {

//        TODO implements result
        String result = "";
        int countLetters = 0;
        int temp = -1;
        do {
            temp = text.indexOf(letter, temp+1);
            if(temp!=-1) countLetters++;
        } while ((temp != -1) && (temp < text.length()));

        result = "Character '" + letter + "' repeated " + countLetters + " times";

        return result;
    }
}
