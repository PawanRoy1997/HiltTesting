package com.simpleapps.hilttesting

object Tax {
    fun calculateTax(grossIncome: Double, taxRate: Double): Double {
        return grossIncome * taxRate
    }

    fun calculateIncome(grossIncome: Double, taxRate: Double): Double {
        return grossIncome - calculateTax(grossIncome, taxRate)
    }
}