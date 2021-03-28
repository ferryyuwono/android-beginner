package com.study.android11101

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun createPersonClass() {
        //Create Person instance from class
        val person1 = Person("Budi", "Arif", 23)
        val person2 = Person("Anton", "Harum", 24)

        //Print person
        person1.printPerson()
        person2.printPerson()

        assertEquals(4, 2 + 2)
    }

    @Test
    fun createPersonDataClass() {
        //Create Person object from data class
        val person1 = PersonData("Budi", "Arif", 23)
        val person2 = PersonData("Anton", "Harum", 24)

        //Print person data
        println("Person 1: $person1")
        println("Person 2: $person2")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun comparePersonClassVsDataClass() {
        val person1 = Person("Budi", "Arif", 23)
        val person2 = PersonData("Budi", "Harum", 23)

        val copyOfPerson1 = Person(person1.firstName, person1.lastName, person1.age)
        val copyOfPerson2 = person2.copy()

        //Print person directly
        println("Person: $copyOfPerson1")
        println("Person: $copyOfPerson2")

        assertEquals(4, 2 + 2)
    }
}
