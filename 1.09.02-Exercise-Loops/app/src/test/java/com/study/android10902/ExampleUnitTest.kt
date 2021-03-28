package com.study.android10902

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun forLoopDownTo() {
        //TODO: Loop using downTo from 10 to 0 with step of 2
        //for (i ...) {
            //println("Number is: $i")
        //}

        assertEquals(4, 2 + 2)
    }

    @Test
    fun loopArray() {
        val intArray = intArrayOf(20, 30, 40, 50, 60)

        //TODO: Loop using withIndex() and print index and value of array
        //for (...) {
            //println("Integer Array at index: $index is: $value")
        //}

        assertEquals(4, 2 + 2)
    }

    @Test
    fun breakLoop() {
        val intArray = arrayOf(20, 30, null, 50, 60)

        //Loop value of intArray
        for (item in intArray) {
            //TODO: Using `if` condition and when value is null, call `break` to exit the loop

            println("Integer Array value: $item")
        }

        assertEquals(4, 2 + 2)
    }

    @Test
    fun continueLoop() {
        val intArray = arrayOf(null, 30, null, 50, null)

        //Loop value of intArray
        for (item in intArray) {
            //TODO: Using `if` condition and when value is null, call `continue` to skip the value

            println("Integer Array value: $item")
        }

        assertEquals(4, 2 + 2)
    }
}
