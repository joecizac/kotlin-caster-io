package com.jozze.kotlinplayground.test

fun main() {
    printSomething("xdd", 1, c = 0.1f, d = 0.2, true)
    printSomething("kdskl", e = false, d = 0.234, c = 0.04f, b = 32)
    printSomethingWithDefaults(e = false, d = 21.344, c = 32.4f, b = 123_32)
    printSomethingWithDefaults(a = "", e = true, d = 0.0, c = 0.0f, b = 1)
}

fun printSomething(a: String, b: Int, c: Float, d: Double, e: Boolean) {
    println("$a $b $c $d $e")
}

fun printSomethingWithDefaults(a: String = "test", b: Int, c: Float, d: Double, e: Boolean) {
    println("$a $b $c $d $e")
}