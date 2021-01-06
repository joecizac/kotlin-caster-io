package com.jozze.kotlinplayground.test

fun main() {

    val a = 12
    val b = 24
    val c = 12
    val d = Foo()
    val e = Foo()
    val f = Foo("joe", 45)
    val g = Foo("joe", 45)
    val h = Foo("Joe", 45)
    val i = h
    val j = "john"
    val k = "john"

    println("a == b : ${a == b}")
    println("a == c : ${a == c}")
    println("a === c : ${a === c}")
    println("d == e : ${d == e}")
    println("d === e : ${d === e}")
    println("f == g : ${f == g}")
    println("f === g : ${f === g}")
    println("g == h : ${g == h}")
    println("g === h : ${g === h}")
    println("h == i : ${h == i}")
    println("h === i : ${h === i}")
    println("j == k : ${j == k}")
    println("j === k : ${j === k}")
}

class Foo(name: String = "", age: Int = 0)

class Boo