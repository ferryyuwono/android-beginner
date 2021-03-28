package com.study.android10801

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun ifCondition() {
        val ageOfBudi = 22
        val ageOfAnton = 24

        //If condition
        if (ageOfBudi < ageOfAnton) {
            println("Budi is younger than Anton")
        }
        else if (ageOfBudi == ageOfAnton) {
            println("Budi is same age as Anton")
        }
        else {
            println("Budi is older than Anton")
        }

        assertEquals(4, 2 + 2)
    }

    @Test
    fun whenCondition() {
        val countryCode = 62

        //When statement
        when (countryCode) {
            60 -> println("You are from Malaysia")
            62 -> println("You are from Indonesia")
            65 -> println("You are from Singapore")
            else -> println("Your country is not listed here")
        }

        //Given height is positive number
        val height = 80

        //When statement
        when (height) {
            in 1..90 -> println("You don't need to pay for MRT")
            else -> println("You need to pay for MRT")
        }

        assertEquals(4, 2 + 2)
    }
}
