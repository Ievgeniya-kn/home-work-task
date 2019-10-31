package com.hillel.lecture_4;

import io.qameta.allure.Step;

import javax.swing.*;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

//        TODO implements result
        boolean result = false;

        int i = 0;

        while (i <= value.length() / 2) {
            if (value.charAt(i) == value.charAt((value.length() - i -1))) {
                i++;
                result = true;
            } else {
                result = false;
                break;
            }

        }

        return result;
    }

}
