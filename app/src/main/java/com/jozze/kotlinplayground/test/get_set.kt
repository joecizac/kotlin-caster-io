package com.jozze.kotlinplayground.test

fun main() {
    println(Player().name)
    Player().apply {
        name = "hehe"
        println(name)
    }

}

class Player {

    var name: String? = "yaya"
        get() = "$field toure"
        set(value) {
            println("'$field' changes to '$value'")
            field = value?.length.toString()
        }
}