package com.study.android10802

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

        //TODO: Simplified variable assignment with if
        val message: String
        if (height < 90) {
            println("Your height is under 90cm")
            message = "You don't need to pay for MRT"
        }
        else {
            println("Your height is equal or above 90cm")
            message = "You need to pay for MRT"
        }

        //Print value of message
        println(message)

        assertEquals(4, 2 + 2)
    }

    @Test
    fun simplifiedWhenVariableAssignment() {
        //Given height is positive number
        val userId = 1L

        //TODO: Simplified variable assignment with if
        val userRole: String
        when (userId) {
            1L -> userRole = "Admin"
            2L -> userRole = "Supervisor"
            3L -> userRole = "Finance"
            4L -> userRole = "Supervisor"
            5L -> userRole = "Supervisor"
            6L -> userRole = "Finance"
            7L -> userRole = "Finance"
            else -> userRole = "User"
        }

        println("User Id: $userId has role: $userRole")

        assertEquals(4, 2 + 2)
    }
}
