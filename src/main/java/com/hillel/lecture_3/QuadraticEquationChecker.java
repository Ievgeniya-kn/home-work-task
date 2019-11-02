package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";

        double x1, x2;
        double discriminant;

        if (a == 0) {
            x1 = -c / b;
            result = "The 'a' coefficient should not be zero!";
        } else {
            discriminant = Math.pow(b, 2) - 4 * a * c;
            if (discriminant < 0) {
               result = "No roots on the set of real numbers!";
            } else if (discriminant == 0) {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                result = "Two real, identical roots: [x1 && x2] = "+x1;
            } else if (discriminant > 0) {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                result = "Discriminant: "  + discriminant+", x1: " +x1+", x2: "+x2;
            }
        }

        return result;
    }

}
