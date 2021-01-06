package com.jozze.kotlinplayground.test

fun main() {
    ::callMe
    ::callMeByMyName
    ::callMeByMyNameAndAge
}

fun callMe() {
    println("Hello there!")
}

fun callMeByMyName(name: String) {
    println("Hey there $name!")
}

fun callMeByMyNameAndAge(name: String, age: Int) {
    println("Hello $name who is $age!")
}