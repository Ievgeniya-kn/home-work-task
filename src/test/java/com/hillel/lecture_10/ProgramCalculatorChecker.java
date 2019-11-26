package com.hillel.lecture_10;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ProgramCalculatorChecker {
    ProgramCalculator programCalculator = new ProgramCalculator(50, 40);

    @Test
    public void programCalculatoSqureOfCircleCheckr() {
        assertEquals(programCalculator.squareOfCircle(),15707.963267948966);
    }

    @Test
    public void programCalculatorSquareOfTriangleChecker() {
        assertEquals(programCalculator.squareOfTriangle(),1000d);
    }

    @Test

    public void programCalculatorClaculatorTypeChecker() {
        assertEquals(programCalculator.calculatorType(),"Program");
    }

}
