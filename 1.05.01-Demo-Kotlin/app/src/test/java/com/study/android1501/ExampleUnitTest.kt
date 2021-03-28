package com.study.android1501

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun print() {
        //Print `Hello` without new line
        print("Hello")

        //Print `Kotlin` with new line
        println("Kotlin")

        //Print concatenate text with new line
        println("Learning " + "Android With Kotlin")

        assertEquals(4, 2 + 2)
    }
}
