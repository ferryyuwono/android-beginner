package com.study.android11101

data class PersonData(val firstName: String, val lastName: String, val age: Int) {

    init {
        println("Initialize Person Data named: $firstName $lastName. Age: $age")
    }
}
