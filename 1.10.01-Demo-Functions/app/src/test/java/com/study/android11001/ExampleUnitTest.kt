package com.study.android11001

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    //Create function to print summation of two integer
    fun printSumOfInteger(number1: Int, number2: Int) {
        val total = number1 + number2
        println("Total: $total")
    }

    @Test
    fun printLunchTotalPrice() {
        val priceOfFood = 10_000
        val priceOfDrink = 5_000

        //Call function
        printSumOfInteger(priceOfFood, priceOfDrink)

        assertEquals(4, 2 + 2)
    }

    //Function with return value of `Float`
    fun calculateAreaOfRectangle(width: Float, height: Float): Float {
        val area = width * height
        return area
    }

    @Test
    fun areaOfRectangle() {
        //Call function and assign return value to variable
        val areaOfRectangle1 = calculateAreaOfRectangle(15f, 3f)
        val areaOfRectangle2 = calculateAreaOfRectangle(22f, 7f)

        println("Area of Rectangle 1: $areaOfRectangle1")
        println("Area of Rectangle 2: $areaOfRectangle2")

        assertEquals(4, 2 + 2)
    }

    //Funcion with default argument
    fun printCurrencySymbol(value: Long, symbol: String = "Rp") {
        println("Money: $symbol $value")
    }

    @Test
    fun printWallet() {
        //Call function and assign return value to variable
        val rupiah = 100_000L
        val dollar = 100L

        //Call function
        printCurrencySymbol(rupiah)
        printCurrencySymbol(dollar, "$")

        assertEquals(4, 2 + 2)
    }
}
