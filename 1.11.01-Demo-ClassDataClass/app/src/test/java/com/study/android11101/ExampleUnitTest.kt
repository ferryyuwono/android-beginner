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
        //Create Person instance from data class
        val person1 = PersonData("Budi", "Arif", 23)
        val person2 = PersonData("Anton", "Harum", 24)

        //Print person data
        println("Person 1: $person1")
        println("Person 2: $person2")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun comparePersonClassVsDataClass() {
        //Create Person instance from class and data class
        val person1 = Person("Budi", "Arif", 23)
        val person2 = PersonData("Budi", "Harum", 23)

        //Create copy of Person instance
        val copyOfPerson1 = Person(person1.firstName, person1.lastName, person1.age)
        val copyOfPerson2 = person2.copy() //Data class has `copy()` function provided

        //Print person directly
        println("Person: $copyOfPerson1") //com.study.android11101.Person
        println("Person: $copyOfPerson2") //PersonData(firstName=Budi, lastName=Harum, age=23)

        assertEquals(4, 2 + 2)
    }
}
