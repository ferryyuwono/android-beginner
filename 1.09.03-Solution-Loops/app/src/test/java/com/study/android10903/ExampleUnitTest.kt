package com.study.android10903

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
        //Loop using downTo from 10 to 0 with step of 2
        for (i in 10 downTo 0 step 2) {
            println("Number is: $i")
        }

        assertEquals(4, 2 + 2)
    }

    @Test
    fun loopArray() {
        val intArray = intArrayOf(20, 30, 40, 50, 60)

        //Loop using withIndex() and print index and value of array
        for ((index, value) in intArray.withIndex()) {
            println("Integer Array at index: $index is: $value")
        }

        assertEquals(4, 2 + 2)
    }

    @Test
    fun breakLoop() {
        val intArray = arrayOf(20, 30, null, 50, 60)

        //Loop value of intArray
        for (item in intArray) {
            //Using `if` condition and when value is null, call `break` to exit the loop
            if (item == null) {
                break
            }

            println("Integer Array value: $item")
        }

        assertEquals(4, 2 + 2)
    }

    @Test
    fun continueLoop() {
        val intArray = arrayOf(null, 30, null, 50, null)

        //Loop value of intArray
        for (item in intArray) {
            //Using `if` condition and when value is null, call `continue` to skip the value
            if (item == null) {
                continue
            }

            println("Integer Array value: $item")
        }

        assertEquals(4, 2 + 2)
    }
}
