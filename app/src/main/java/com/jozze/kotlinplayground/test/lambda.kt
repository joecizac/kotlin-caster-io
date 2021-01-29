package com.jozze.kotlinplayground.test

fun main() {
    printLambda("ABC", 5)
    println(returnLambda("XYZ", 123))
    val msg = "the count is ${
        lambdaParam(56) { text, number ->
            "$text$number".length
        }
    }"
    println(msg)
}

val printLambda = { a: String, b: Int ->
    println("$a$b")
}

val returnLambda = { a: String, b: Int ->
    "$a$b".length
}

fun lambdaParam(count: Int, lambda: (String, Int) -> Int): String {
    val lambdaResult = lambda("IJK", 47)
    return (count + lambdaResult).toString()
}