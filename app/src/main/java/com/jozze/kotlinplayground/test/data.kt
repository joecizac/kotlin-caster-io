package com.jozze.kotlinplayground.test

fun main() {
    val emp1 = Employee(name = "Ruth")
    val emp2 = Employee(2, name = "Seth")
    val emp3 = Employee(2,"Seth")
    println(emp2 == emp3)
    println(emp2 === emp3)

    emp1.component1() // returns empId
    emp1.component2() // returns name

    // simple class cannot have 'component' structuring
}

data class Employee(var empId: Int = -1, val name: String)