package com.study.android1601

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun readOnlyVariables() {
        //Define read-only variables
        val numberA: Int = 1 //Immediate assignment
        val numberB = 1 //Int type is inferred
        val numberC: Int //Type is needed because there's no immediate assignment

        //Print value of number
        println("NumberA: " + numberA) //Can be converted to template
        println("NumberB: $numberB")

        numberC = numberA + numberB //deferred assignment
        println("NumberC: $numberC") //No longer prompt error

        //numberC = 10 //Will give error "Val cannot be reassigned"

        assertEquals(2, numberC)
    }

    @Test
    fun variables() {
        //Imagine we have rectangle and want to calculate the area of the rectangle

        //Define rectangle variables
        var width = 10
        var height = 5
        var area = width * height

        //Print value of area
        println("Area of rectangle: $area")

        //We change the width and height of rectangle
        width = 25
        height = 4
        area = width * height

        //Print new value of area
        println("Area of new rectangle: $area")

        assertEquals(area, width * height)
    }

    @Test
    fun dataTypes() {
        //Numbers
        val byteVariable: Byte = 127
        val shortVariable: Short = -32768
        val intVariable: Int = 1000
        val longVariable: Long = 1L
        println("Byte: $byteVariable")
        println("Short: $shortVariable")
        println("Int: $intVariable")
        println("Long: $longVariable")

        //Floating-points
        val floatVariable: Float = 22 / 7.0f
        val doubleVariable: Double = 22 / 7.0
        println("Float: $floatVariable")
        println("Double: $doubleVariable")

        //Booleans
        val boolVariable: Boolean = true
        println("Boolean: $boolVariable")

        //Characters
        val charVariable: Char = 'a'
        val newLineEscapeCharacter: Char = '\n'
        val unicodeEscapeVariable: Char = '\u00A9'
        println("Char: $charVariable")
        println("New Line: $newLineEscapeCharacter")
        println("Copyright: $unicodeEscapeVariable")

        //Strings
        val stringVariable: String = "Hello World"
        println("String: $stringVariable")

        assertEquals(4, 2 + 2)
    }
}
