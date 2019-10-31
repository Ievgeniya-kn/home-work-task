package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {

//        TODO implements result
        String result = "";




        return result;
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {

//        TODO implements result
        int result = 0;

        for (int i = 0; i < value.length(); i++) {
            int powS = value.length() -i -1;
           switch (value.charAt(i)) {
               case '1' :
                result = (int) (result + Math.pow(16, powS));
                break;
               case '2' :
                   result = (int) (result + 2 *Math.pow(16, powS));
                   break;
               case '3' :
                   result = (int) (result + 3 *Math.pow(16, powS));
                   break;
               case '4' :
                   result = (int) (result + 4 *Math.pow(16, powS));
                   break;
               case '5' :
                   result = (int) (result + 5 *Math.pow(16, powS));
                   break;
               case '6' :
                   result = (int) (result + 6 * Math.pow(16, powS));
                   break;
               case '7' :
                   result = (int) (result + 7 *Math.pow(16, powS));
                   break;
               case '8' :
                   result = (int) (result + 8 *Math.pow(16, powS));
                   break;
               case '9' :
                   result = (int) (result + 9 *Math.pow(16, powS));
                   break;
               case 'A' :
                   result = (int) (result + 10 *Math.pow(16, powS));
                   break;
               case 'B' :
                   result = (int) (result + 11 *Math.pow(16, powS));
                   break;
               case 'C' :
                   result = (int) (result + 12 *Math.pow(16, powS));
                   break;
               case 'D' :
                   result = (int) (result + 13 *Math.pow(16, powS));
                   break;
               case 'E' :
                   result = (int) (result + 14 *Math.pow(16, powS));
                   break;
               case 'F' :
                   result = (int) (result + 15 * Math.pow(16, powS));

            }
        }

        return result;
    }

//    public static void main(String[] args) {
//        int expectedResult = 8855064;
//        DecimalToHexadecimalChecker checker = new DecimalToHexadecimalChecker();
//        int i = checker.fromHexadecimalToDecimal("871E18");
//    }
}
