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
        val person1 = Person("Budi", 23)
        val person2 = Person("Anton", 24)

        println("Person 1: ${person1.name} ${person1.age} years old")
        println("Person 2: ${person2.name} ${person2.age} years old")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun createPersonDataClass() {
        val person1 = PersonData("Budi", 23)
        val person2 = PersonData("Anton", 24)

        println("Person 1: ${person1.name} ${person1.age} years old")
        println("Person 2: ${person2.name} ${person2.age} years old")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun comparePersonClassVsDataClass() {
        val person1 = Person("Budi", 23)
        val person2 = PersonData("Budi", 23)

        println("Person Class: $person1")
        println("Person Data Class: $person2")

        assertEquals(4, 2 + 2)
    }
}
