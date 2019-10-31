package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

//        TODO implements result
        int result = 0;
        int j = 0;
        int powTwo = 1;
        while (value > powTwo) {
            j++;
            powTwo = (int)Math.pow(2, j);
        }

        for (int i = j-1; i >= 0; i--) {
            powTwo = (int)Math.pow(2, i);
            if (value >= powTwo) {
                result = result + (int)Math.pow(10, i);
                value = value - powTwo;
            }

        }

        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;
        String valueS = "" + value;

        for (int i = 0; i < valueS.length(); i++) {
            int powS = valueS.length() - i - 1;
            if (valueS.charAt(i)=='1') {
                    result =  result + (int)Math.pow(2, powS);
            }
        }

        return result;
    }
   public static void main(String[] args) {

       BinaryToDecimalChecker  checker = new BinaryToDecimalChecker();
        int i = checker.fromDecimalToBinary(5);
    }

}
