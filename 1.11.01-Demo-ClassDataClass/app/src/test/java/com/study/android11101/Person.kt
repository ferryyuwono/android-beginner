package com.study.android11101

class Person(val firstName: String, val lastName: String, val age: Int) {

    init {
        println("Initialize Person named: $firstName $lastName. Age: $age")
    }

    fun printPerson() {
        println("Person: $firstName $lastName is $age years old")
    }
}
