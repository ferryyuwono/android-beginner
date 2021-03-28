package com.study.android11002

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    //TODO: Simplified function to single expression
    fun calculateAreaOfRectangle(width: Float, height: Float): Float {
        val area = width * height
        return area
    }

    @Test
    fun areaOfRectangle() {
        //TODO: Call function using named argument
        val areaOfRectangle = calculateAreaOfRectangle(14f, 12f)

        println("Area of Rectangle: $areaOfRectangle")

        assertEquals(4, 2 + 2)
    }

    //TODO: Create extension function for Int. Add `Int.` at the start of the function name
    //fun ...printSquareArea() {
        //TODO: Print Square value, access Int value by using `this`
        //println("Square Area: ${...}")
    //}

    @Test
    fun callExtensionFunction() {
        //Given width of the square is Int
        val widthOfSquare = 16

        //TODO: Call Int extension function to print the square area


        assertEquals(4, 2 + 2)
    }
}
