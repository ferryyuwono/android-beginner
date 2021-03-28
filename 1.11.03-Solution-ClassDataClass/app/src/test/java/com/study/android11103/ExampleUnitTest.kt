package com.study.android11103

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    //Create data class Person which has firstName, lastName, age, address, city, phoneNumber

    @Test
    fun initializeAndPrintDataClass() {
        //Create instance of data class using name argument parameter
        val person1 = Person(
            firstName = "Budi",
            lastName = "Arif",
            age = 25,
            address = "Jalan Sudirman No 1",
            city = "DKI Jakarta",
            phoneNumber = "081234567890"
        )

        //Print data class
        println("Person1: $person1")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun createCatClass() {
        //Create instance of `Cat` class using `Companion Object`  inside it as parameter
        val cat1 = Cat(Cat.ACTION_HUNGRY) //ACTION_HUNGRY
        val cat2 = Cat(Cat.ACTION_SLEEPING) //ACTION_SLEEPING

        //Call `printAction()` function from cat1 and cat2
        cat1.printAction()
        cat2.printAction()

        assertEquals(4, 2 + 2)
    }
}
