package com.study.android10901

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun forLoop() {
        //Loop from 0 to 3 (4 times)
        for (i in 0..3) {
            println("Hello $i")
        }

        //Loop from 0 until 3 (3 times, 3 is excluded)
        for (i in 0 until 3) {
            println("World $i")
        }

        assertEquals(4, 2 + 2)
    }

    @Test
    fun loopContentOfCollections() {
        val intArray = intArrayOf(20, 30, 40, 50, 60)

        //Loop all content of intArray
        for (item in intArray) {
            println("Number is: $item")
        }

        assertEquals(4, 2 + 2)
    }

    @Test
    fun whileLoop() {
        var countDown = 5

        //Loop while countdown is greater than 0
        while (countDown > 0) {
            println("Count down in: $countDown")
            countDown--
        }

        assertEquals(4, 2 + 2)
    }

    @Test
    fun doWhileLoop() {
        var countDown = 0

        do {
            println("Count down in: $countDown")
            countDown--
        } while (countDown > 0)
        //Even though the condition is false since beginning,
        //the print will still be executed at least once

        assertEquals(4, 2 + 2)
    }
}
