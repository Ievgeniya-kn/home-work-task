package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

//        TODO implements result
        boolean isValid = false;

        int[] inputNumbers = new int[6];
        double outputNumbers = 0;
        double result = 1;

        int indexOfSpace = code.indexOf(' ');

        char[] input = (code.substring(0, indexOfSpace)).toCharArray();
        char[] output = (code.substring(indexOfSpace + 1)).toCharArray();

        int j = 0;

        for (int i = 0; i < input.length; i++) {

            if (intFromChar(input[i]) != -1) {
                inputNumbers[j] = intFromChar(input[i]);
                j++;
            } else if (Character.isUpperCase(input[i]) == false)
                return isValid;
        }

        for (int i = 0; i < 5; i += 2) {
            result = result * (inputNumbers[i] * 10 + inputNumbers[i + 1]);
        }

        for (int i = 0; i < output.length; i++) {
            outputNumbers = outputNumbers + intFromChar(output[i]) * Math.pow(10, output.length - i - 1);
        }

        if (outputNumbers == result)
            isValid = true;


        return isValid;
    }

    public static int intFromChar(char number) {
        switch (number) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                return -1;
        }
    }
}
