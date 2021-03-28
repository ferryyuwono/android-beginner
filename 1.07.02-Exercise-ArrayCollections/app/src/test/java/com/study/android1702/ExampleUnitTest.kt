package com.study.android1702

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun simplifiedArrayAndCollections() {
        //TODO: Simplified variable declaration
        val intArray: IntArray = intArrayOf(0, 1, 2, 3)
        val arrayOfInt: Array<Int> = arrayOf<Int>(0, 1, 2, 3)
        val listOfInt: List<Int> = listOf<Int>(0, 1, 2, 3)
        val mutableListOfInt: MutableList<Int> = mutableListOf<Int>(0, 1, 2, 3)

        println("Integer Array index 0: ${intArray[0]}")
        println("Array of Integer index 1: ${arrayOfInt[1]}")
        println("List of Integer index 2: ${listOfInt[2]}")
        println("Mutable List of Integer index 3: ${mutableListOfInt[2]}")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun createArrayOfNullableInteger() {
        //TODO: Create array which can store null and integer with size of 3
        //val array = ...

        //TODO: Uncomment to print array value
        //println("Array index 0: ${array[0]}")
        //println("Array index 1: ${array[1]}")
        //println("Array index 2: ${array[2]}")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun convertImmutableToMutableCollections() {
        val listOfInt: List<Int> = listOf<Int>(0, 1, 2)

        //TODO: Create mutable list from immutable list
        //val mutableList: MutableList<Int> = listOfInt

        //TODO: Modify mutable list value to [4, 5, 6]


        //TODO: Add new item `7` to list


        //TODO: Uncomment to print mutable list value
        //println("Mutable List index 0: ${mutableList[0]}")
        //println("Mutable List index 1: ${mutableList[1]}")
        //println("Mutable List index 2: ${mutableList[2]}")
        //println("Mutable List index 3: ${mutableList[3]}")

        assertEquals(4, 2 + 2)
    }
}
