package com.simpleapps.hilttesting

import org.junit.Test

internal class TaxTest {
    @Test
    fun calculateTaxTest() {
        val calculatedTax = Tax.calculateTax(100.0, 0.1)
        val expectedTax = 10.0
        assert(calculatedTax == expectedTax)
    }

    @Test
    fun calculateIncomeTest() {
        val calculatedIncome = Tax.calculateTax(100.0, 0.1)
        val expectedIncome = 10.0
        assert(expectedIncome == calculatedIncome)
    }
}