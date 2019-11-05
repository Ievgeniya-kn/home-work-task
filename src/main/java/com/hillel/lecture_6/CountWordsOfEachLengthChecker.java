package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {

//        TODO implements result
        int result = 0;

        String[] splitSentence =sentence.split((" "));
        for (int i = 0; i < splitSentence.length; i++) {
            if (splitSentence[i].length()==wordLength)
                result++;
        }


        return result;
    }


}
