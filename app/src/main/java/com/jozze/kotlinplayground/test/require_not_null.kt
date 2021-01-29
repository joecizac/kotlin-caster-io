package com.jozze.kotlinplayground.test

fun main() {
    val something: String? = null
    println("the initial text length is '${something?.length}'")
//    println(requireNotNull("the text length is '${something?.length}'", {
//        something = "the new text length is '${something?.length}'"
//        println(something?.length)
//        "hi hi hi"
//    }))

    val name: String? = null
    println("the name is ${requireNotNull(name, { "custom exception encountered" })}")
}