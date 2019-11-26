package com.hillel.lecture_10;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class AccounterCalculatorChecker {
    AccounterCalculator accounterCalculator= new AccounterCalculator(12,48);

    @Test
    public void AccounterCalculatorPercentageChecker() {
        assertEquals(accounterCalculator.persentage(),5.76);
    }

    @Test
    public void AccounterCalculatoTypeChecker() {
        assertEquals(accounterCalculator.calculatorType(),"Accounter");
    }


}
