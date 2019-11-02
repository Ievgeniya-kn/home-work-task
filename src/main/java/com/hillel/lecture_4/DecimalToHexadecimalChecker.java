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

        int j = 0;
        int powSixteen = 1;
        while (value > powSixteen) {
            j++;
            powSixteen = (int) Math.pow(16, j);
        }

        for (int i = j - 1; i >= 0; i--) {
            powSixteen = (int) Math.pow(16, i);
            switch (value / powSixteen) {
                case 1: {
                    result = result + "1";
                    break;
                }
                case 2: {
                    result = result + "2";
                    break;
                }
                case 3: {
                    result = result + "3";
                    break;
                }
                case 4: {
                    result = result + "4";
                    break;
                }
                case 5: {
                    result = result + "5";
                    break;
                }
                case 6: {
                    result = result + "6";
                    break;
                }
                case 7: {
                    result = result + "7";
                    break;
                }
                case 8: {
                    result = result + "8";
                    break;
                }
                case 9: {
                    result = result + "9";
                    break;
                }
                case 10: {
                    result = result + "A";
                    break;
                }
                case 11: {
                    result = result + "B";
                    break;
                }
                case 12: {
                    result = result + "C";
                    break;
                }
                case 13: {
                    result = result + "D";
                    break;
                }
                case 14: {
                    result = result + "E";
                    break;
                }
                case 15: {
                    result = result + "F";
                    break;
                }
                default:
                    result = result + "0";
            }

            if (value >= powSixteen) {
                value = value % powSixteen;
            }
        }
            return result;
        }

        @Step
        public int fromHexadecimalToDecimal (String value){

//        TODO implements result
            int result = 0;

            for (int i = 0; i < value.length(); i++) {
                int powS = value.length() - i - 1;
                switch (value.charAt(i)) {
                    case '1':
                        result = (int) (result + Math.pow(16, powS));
                        break;
                    case '2':
                        result = (int) (result + 2 * Math.pow(16, powS));
                        break;
                    case '3':
                        result = (int) (result + 3 * Math.pow(16, powS));
                        break;
                    case '4':
                        result = (int) (result + 4 * Math.pow(16, powS));
                        break;
                    case '5':
                        result = (int) (result + 5 * Math.pow(16, powS));
                        break;
                    case '6':
                        result = (int) (result + 6 * Math.pow(16, powS));
                        break;
                    case '7':
                        result = (int) (result + 7 * Math.pow(16, powS));
                        break;
                    case '8':
                        result = (int) (result + 8 * Math.pow(16, powS));
                        break;
                    case '9':
                        result = (int) (result + 9 * Math.pow(16, powS));
                        break;
                    case 'A':
                        result = (int) (result + 10 * Math.pow(16, powS));
                        break;
                    case 'B':
                        result = (int) (result + 11 * Math.pow(16, powS));
                        break;
                    case 'C':
                        result = (int) (result + 12 * Math.pow(16, powS));
                        break;
                    case 'D':
                        result = (int) (result + 13 * Math.pow(16, powS));
                        break;
                    case 'E':
                        result = (int) (result + 14 * Math.pow(16, powS));
                        break;
                    case 'F':
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
