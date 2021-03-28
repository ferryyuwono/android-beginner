package com.study.android11101

class Person(name: String, age: Int) {
    val name: String = name
    val age: Int = age

    init {
        println("Initialize Person named: $name. Age: $age")
    }
}
