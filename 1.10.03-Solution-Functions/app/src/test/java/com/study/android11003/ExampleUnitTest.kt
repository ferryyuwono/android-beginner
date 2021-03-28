package com.study.android11003

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    //Simplified function to single expression
    fun calculateAreaOfRectangle(width: Float, height: Float) = width * height

    @Test
    fun areaOfRectangle() {
        //Call function using named argument
        val areaOfRectangle = calculateAreaOfRectangle(width = 14f, height = 12f)

        println("Area of Rectangle: $areaOfRectangle")

        assertEquals(4, 2 + 2)
    }

    //Create extension function for Int. Add `Int.` at the start of the function name
    fun Int.printSquareArea() {
        //Print Square value, access Int value by using `this`
        println("Square Area: ${this * this}")
    }

    @Test
    fun callExtensionFunction() {
        //Given width of the square is Int
        val widthOfSquare = 16

        //Call Int extension function to print the square area
        widthOfSquare.printSquareArea()

        assertEquals(4, 2 + 2)
    }
}
