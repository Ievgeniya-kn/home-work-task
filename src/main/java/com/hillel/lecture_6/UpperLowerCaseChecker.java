package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

//        TODO implements result
        String result = word.toUpperCase();

        return result;
    }

    @Step
    public String toLowerCase(String word) {

//        TODO implements result
        String result = word.toLowerCase();

        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {

//        TODO implements result
        String result = "";

        if ((sentence.indexOf(".") < sentence.length()-1) && sentence.indexOf(".") > 0) {
            String[] arraySentence;
            arraySentence = sentence.split("\\. ");

            result=toSentenceCase(arraySentence[0]);

            for (int i = 1; i < arraySentence.length; i++) {
                result = result +". "+ toSentenceCase(arraySentence[i]);
            }

        } else {

            result = toSentenceCase(sentence);
        }

        return result;
    }

    @Step
    public String eachLetterToUpperCase(String sentence) {

//        TODO implements result
        String result = "";

        String[] arrayResult=sentence.split(" ");

        result=toSentenceCase(arrayResult[0]);

        for (int i = 1; i < arrayResult.length; i++) {
            result =result +" "+ toSentenceCase(arrayResult[i]);
        }

        return result;
    }

    public static String toSentenceCase (String sentence)   {
        String result=sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
        return result;

    }
}
