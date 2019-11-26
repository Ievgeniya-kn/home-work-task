package com.hillel.lecture_10;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class EngineerCalculatorChecker {

    EngineerCalculator engineerCalculator=new EngineerCalculator(0.5,0.3);

    @Test
    public void EngineerCalculatorPlusChecker() {
        assertEquals(engineerCalculator.plus(),0.8);
    }

    @Test
    public void EngineerCalculatorSinChecker() {
        assertEquals(engineerCalculator.sinusFunction(),0.479425538604203);
    }

    @Test
    public void EngineerCalculatorCosChecker() {
        assertEquals(engineerCalculator.cosFunction(),0.8775825618903728);
    }

    @Test
    public void EngineerCalculatorLogChecker() {
        assertEquals(engineerCalculator.lnFunction(),-1.2039728043259361);
    }

    @Test
    public void EngineerCalculatorPowChecker() {
        assertEquals(engineerCalculator.powFunction(),0.8122523963562356);
    }

    @Test
    public void EngineerCalculatoTypeChecker() {
        assertEquals(engineerCalculator.calculatorType(),"Engineer");
    }
}
