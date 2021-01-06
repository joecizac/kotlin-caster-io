package com.jozze.kotlinplayground.test

fun main() {
    val user1 = User("Joe", "Infosys")
//    val user2 = user1.copy // cannot copy simple class

    val employer1 = Employer("Manager", "Mobile")
    val employer2 = employer1.copy()
    println(employer1 == employer2)
    println(employer1 === employer2)
    val employer3 = employer2.copy(department = "Web")
    println(employer2)
    println(employer3)
}

open class User(var name: String = "some name", var company: String = "some company")

open class UserType

data class Employer(val designation: String, val department: String)

data class EmployerType(val type: String): UserType()

