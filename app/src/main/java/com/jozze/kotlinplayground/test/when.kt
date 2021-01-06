package com.jozze.kotlinplayground.test

fun main() {
    when {
        false -> println("whatev!!")
        true -> println("yay!!")
        3 > 4 -> println("noways!!")
        6 > 4 -> println("c'mon!!")
    }

    val value = 4
    when(value) {
        1 -> println("yay!! 1")
        2 -> println("yay!! 2")
        3, 4 -> println("yay!! 3, 4")
        5, 6, 7 -> println("yay!! 5, 6, 7")
    }

    val price = 345
    var discount = when {
        price < 250 -> 4.5.also { println(it::class.java) }
        price < 350 -> 5.9F.also { println(it::class.java) }
        price < 500 -> 10.0.also { println(it::class.java) }
        else -> null
    }
}