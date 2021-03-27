package com.study.android1603

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun simplifiedVariableDeclaration() {
        //Remove data type
        val examScore = 95
        val userId = 1L
        val pi = 3.14f
        val message = "Hello"
        val isChecked = false

        println("Exam Score: $examScore")
        println("User Id: $userId")
        println("Pi: $pi")
        println("Message: $message")
        println("Is Checked: $isChecked")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun makeItMoreReadable() {
        //Add underscores to make number more readable
        val money = 1_000_000
        val accountBalance = 32_145_751_548_515L

        println("Money: $money")
        println("Account Balance: $accountBalance")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun explicitConversions() {
        //Add explicit conversion toLong()
        val pocketMoney = 1000
        val pocketMoneyInLong: Long = pocketMoney.toLong()

        println("Pocket Money: $pocketMoneyInLong")

        //Add explicit conversion toDouble()
        val radius = 15.5f
        val diameter: Double = radius.toDouble() * 2

        println("Diameter: $diameter")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun nullable() {
        //Add `?` to data type to make it nullable
        var nullableInt: Int? = null
        var nullableDouble: Double? = null
        var nullableBoolean: Boolean? = null
        var nullableString: String? = null

        println("Nullable Int: $nullableInt")
        println("Nullable Double: $nullableDouble")
        println("Nullable Boolean: $nullableBoolean")
        println("Nullable String: $nullableString")

        nullableInt = 10
        nullableDouble = 3.14
        nullableBoolean = true
        nullableString = "World"

        println("Nullable Int: $nullableInt")
        println("Nullable Double: $nullableDouble")
        println("Nullable Boolean: $nullableBoolean")
        println("Nullable String: $nullableString")

        assertEquals(4, 2 + 2)
    }

    /*
    Unsigned types are available only since Kotlin 1.3 and
    currently in Beta when this code was made
     */
    @ExperimentalUnsignedTypes
    @Test
    fun unsignedType() {
        //Change data type to unsigned data types (positive value only)
        val unsignedByte: UByte = 128u
        val unsignedShort: UShort = 32768u
        val unsignedInt: UInt = 2147483648u

        println("Unsigned Int: $unsignedByte")
        println("Unsigned Double: $unsignedShort")
        println("Unsigned Boolean: $unsignedInt")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun smileUnicode() {
        //Change smile unicode value to unicode surrogate pair
        val smileUnicode = "\uD83D\uDE04"

        println("Smile: $smileUnicode")

        assertEquals(4, 2 + 2)
    }
}
