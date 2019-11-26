package com.hillel.lecture_10;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SimpleCalculatorChecker {

    SimpleCalculator simpleCalculator = new SimpleCalculator(148,12);

    @Test
    public void SimpleCalculatorPlusChecker() {
        assertEquals(simpleCalculator.plus(),160d);
    }

    @Test
    public void SimpleCalculatorMinisChecker() {
        assertEquals(simpleCalculator.minus(),136d);
    }

    @Test
    public void SimpleCalculatorDivisionChecker() {
        assertEquals(simpleCalculator.division(),12.333333333333334);
    }

    @Test
    public void SimpleCalculatorMultiplicatioChecker() {
        assertEquals(simpleCalculator.multiplication(),1776d);
    }

    @Test
    public void SimpleCalculatoTypeChecker() {
        assertEquals(simpleCalculator.calculatorType(),"Simple");
    }
}
