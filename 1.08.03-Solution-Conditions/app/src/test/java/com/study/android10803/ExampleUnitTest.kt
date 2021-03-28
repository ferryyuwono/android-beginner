package com.study.android10803

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun simplifiedIfVariableAssignment() {
        //Given height is positive number
        val height = 180

        //Simplified variable assignment with if
        val message = if (height < 90) {
            println("Your height is under 90cm")
            "You don't need to pay for MRT"
        }
        else {
            println("Your height is equal or above 90cm")
            "You need to pay for MRT"
        }

        //Print value of message
        println(message)

        assertEquals(4, 2 + 2)
    }

    @Test
    fun simplifiedWhenVariableAssignment() {
        //Given height is positive number
        val userId = 1L

        //Simplified variable assignment with when
        val userRole = when (userId) {
            1L -> "Admin"
            2L, 4L, 5L -> "Supervisor"
            3L, 6L, 7L -> "Finance"
            else -> "User"
        }

        println("User Id: $userId has role: $userRole")

        assertEquals(4, 2 + 2)
    }
}
