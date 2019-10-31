package com.hillel.lecture_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {

//        TODO implements result
        int[] result = values;

        Arrays.sort(result);

        return result;
    }

    @Step
    public int[] fromMaxToMin(int[] values) {

//        TODO implements result
        int[] result = values;

        int lengthArray=result.length;

        for (int j=0;j<lengthArray;j++) {
            int temporary=result[j];
            int i=j-1;
            while ( (i > -1) && ( result [i] < temporary ) ) {
                result [i+1] = result [i];
                i--;
            }
            result[i+1] = temporary;

        }

        return result;
    }
}
