package com.hillel.lecture_7;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Write class to represent FractionNumbers
 * This class should contain two fields.
 * This class should contain methods to perform basic math operations:
 * plus, minus, multiply, divide
 * Also, this class should have toString method to print numbers into standard output
 * Add tests for check functionality of FractionNumber class
 */
public class FractionNumbersTestTask {

    private FractionNumber fractionNumber = new FractionNumber(9, 3);

    @Test
    public void testPlus() {
        assertEquals(fractionNumber.fractionNumberPlus(), 12);
    }


    @Test
    public void testMinus() {
        assertEquals(fractionNumber.fractionNumberMinus(), 6);
    }

    @Test
    public void testMultiply() {
        assertEquals(fractionNumber.fractionNumberMultiply(), 27);
    }

    @Test
    public void testDivide() {
        assertEquals(fractionNumber.fractionNumberDivide(), 3);
    }

    @Test
    public void testToString() {
        assertEquals(fractionNumber.toString(),"FractionNumber{numberOne=9, numberTwo=3}");
    }

}
