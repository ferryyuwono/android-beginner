package com.study.aandroid1602

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
        //TODO: Remove data type
        val examScore: Int = 95
        val userId: Long = 1L
        val pi: Float = 3.14f
        val message: String = "Hello"
        val isChecked: Boolean = false

        println("Exam Score: $examScore")
        println("User Id: $userId")
        println("Pi: $pi")
        println("Message: $message")
        println("Is Checked: $isChecked")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun makeItMoreReadable() {
        //TODO: Add underscores to make number more readable
        val money = 1000000
        val accountBalance = 32145751548515L

        println("Money: $money")
        println("Account Balance: $accountBalance")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun explicitConversions() {
        //TODO: Add explicit conversion toLong()
        val pocketMoney = 1000
        val pocketMoneyInLong: Long = pocketMoney

        println("Pocket Money: $pocketMoneyInLong")

        //TODO: Add explicit conversion toDouble()
        val radius = 15.5f
        val diameter: Double = radius * 2

        println("Diameter: $diameter")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun nullable() {
        //TODO: Add `?` to data type to make it nullable
        var nullableInt: Int = null
        var nullableDouble: Double = null
        var nullableBoolean: Boolean = null
        var nullableString: String = null

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
        //TODO: Change data type to unsigned data types (positive value only)
        val unsignedByte: Byte = 128
        val unsignedShort: Short = 32768
        val unsignedInt: Int = 2147483648

        println("Unsigned Int: $unsignedByte")
        println("Unsigned Double: $unsignedShort")
        println("Unsigned Boolean: $unsignedInt")

        assertEquals(4, 2 + 2)
    }

    @Test
    fun smileUnicode() {
        //TODO: Change smile unicode value to unicode surrogate pair
        val smileUnicode = "\u1F603"

        println("Smile: $smileUnicode")

        assertEquals(4, 2 + 2)
    }
}
