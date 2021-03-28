package com.study.android11103

class Cat(val action: String) {
    fun printAction() {
        println("I am $action")
    }

    //Object inside a class that can be accessed without creating new instance
    companion object {
        const val ACTION_HUNGRY = "hungry"
        const val ACTION_SLEEPING = "sleeping"
    }
}
