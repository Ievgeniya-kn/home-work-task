package com.hillel.lecture_10;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class FinanceCalculatorChecker {
    FinanceCalculator financeCalculator = new FinanceCalculator(4500, 24, 60);

    @Test
    public void FinanceCalculatoMonthlyRentChecker() {
        assertEquals(financeCalculator.monthlyRent(), 90d);
    }


    @Test
    public void FinanceCalculatoTotalDepositChecker() {
        assertEquals(financeCalculator.totalDeposit(), 24d);
    }


    @Test
    public void FinanceCalculatoTypeChecker() {
        assertEquals(financeCalculator.calculatorType(), "Finance");
    }

}
