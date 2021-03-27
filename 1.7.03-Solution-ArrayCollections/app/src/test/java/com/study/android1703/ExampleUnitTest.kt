package com.study.android1703

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
        //Simplified variable declaration
        val intArray = intArrayOf(0, 1, 2, 3)
        val arrayOfInt = arrayOf(0, 1, 2, 3)
        val listOfInt = listOf(0, 1, 2, 3)
        val mutableListOfInt = mutableListOf(0, 1, 2, 3)

        println("Integer Array index 0: ${intArray[0]}")
        println("Array of Integer index 1: ${arrayOfInt[1]}")
        println("List of Integer index 2: ${listOfInt[2]}")
        println("Mutable List of Integer index 3: ${mutableListOfInt[2]}")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun createArrayOfNullableString() {
        //Create array which can store null and integer with size of 3
        val array: Array<Int?> = arrayOf(0, null, 2) //You can also remove the data types

        //Uncomment to print array value
        println("Array index 0: ${array[0]}")
        println("Array index 1: ${array[1]}")
        println("Array index 2: ${array[2]}")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun convertImmutableToMutableCollections() {
        val listOfInt: List<Int> = listOf<Int>(0, 1, 2)

        //Create mutable list from immutable list
        val mutableList: MutableList<Int> = listOfInt.toMutableList()

        //Modify mutable list value to [4, 5, 6]
        mutableList[0] = 4
        mutableList[1] = 5
        mutableList[2] = 6

        //Add new item `7` to list
        mutableList.add(7)

        //Uncomment to print mutable list value
        println("Mutable List index 0: ${mutableList[0]}")
        println("Mutable List index 1: ${mutableList[1]}")
        println("Mutable List index 2: ${mutableList[2]}")
        println("Mutable List index 3: ${mutableList[3]}")

        assertEquals(4, 2 + 2)
    }
}
