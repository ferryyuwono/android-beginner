package com.study.android1701

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun primitiveArray() {
        //Create integer array with size of 3
        val intArray: IntArray = intArrayOf(0, 1, 2)

        println("Integer Array index 0: ${intArray[0]}")
        println("Integer Array index 1: ${intArray[1]}")
        println("Integer Array index 2: ${intArray[2]}")
        //println("Array of Integer index 3: ${intArray[3]}") //Will prompt error ArrayIndexOutOfBoundsException

        //Modify integer array value
        intArray[0] = 4
        intArray[1] = 5
        intArray[2] = 6
        //intArray[3] = 7 //Will prompt error ArrayIndexOutOfBoundsException

        println("Modified Integer Array index 0: ${intArray[0]}")
        println("Modified Integer Array index 1: ${intArray[1]}")
        println("Modified Integer Array index 2: ${intArray[2]}")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun arrayOf() {
        //Create array of `T` as integer with size of 3
        val arrayOfInt: Array<Int> = arrayOf<Int>(0, 1, 2)

        println("Array of Integer index 0: ${arrayOfInt[0]}")
        println("Array of Integer index 1: ${arrayOfInt[1]}")
        println("Array of Integer index 2: ${arrayOfInt[2]}")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun immutableCollections() {
        //Create immutable list of `T` as integer
        val listOfInt: List<Int> = listOf<Int>(0, 1, 2)

        println("List of Integer index 0: ${listOfInt[0]}")
        println("List of Integer index 1: ${listOfInt[1]}")
        println("List of Integer index 2: ${listOfInt[2]}")
        //println("List of Integer index 3: ${listOfInt[3]}") //Will prompt error ArrayIndexOutOfBoundsException

        //listOfInt[0] = 4 //Error because list is imutable

        assertEquals(4, 2 + 2)
    }

    @Test
    fun mutableCollections() {
        //Create read-only list of `T` as integer
        val listOfInt: MutableList<Int> = mutableListOf<Int>(0, 1, 2)

        println("List of Integer index 0: ${listOfInt[0]}")
        println("List of Integer index 1: ${listOfInt[1]}")
        println("List of Integer index 2: ${listOfInt[2]}")
        //println("List of Integer index 3: ${listOfInt[3]}") //Will prompt error ArrayIndexOutOfBoundsException

        //Modify list of integer value
        listOfInt[0] = 4
        listOfInt[1] = 5
        listOfInt[2] = 6

        //Add new item to list
        listOfInt.add(7)

        println("Modified List of Integer index 0: ${listOfInt[0]}")
        println("Modified List of Integer index 1: ${listOfInt[1]}")
        println("Modified List of Integer index 2: ${listOfInt[2]}")
        println("Modified List of Integer index 3: ${listOfInt[3]}") //Will not prompt error

        assertEquals(4, 2 + 2)
    }
}
