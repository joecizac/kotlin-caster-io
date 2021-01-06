package com.jozze.kotlinplayground.test

fun main() {
    println("Organism hash = $hash")
    println("Human ID = ${Human.name}")
    println("Person name = ${Person.name}")
}

const val hash = "aefbbc63783cccbfae="

object Human {
    const val name = "AXA_3423"
}

class Person {
    companion object {
        const val name = "Sam"
    }
}