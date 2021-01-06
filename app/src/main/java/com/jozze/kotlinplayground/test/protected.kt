package com.jozze.kotlinplayground.test

fun main() {
    val employer1 = ProtectedEmployer("Manager", "Mobile")
    val employer2 = employer1.copy()
    val employer3 = employer2.copy(department = "Web")
    println(employer2)
    println(employer3)
}

open class ProtectedUser(protected var name: String = "some name", var company: String = "some company") {
    protected fun setCompanyName(company: String) {
        this.company = company
    }

    internal lateinit var address: String
}

data class ProtectedEmployer(val designation: String, val department: String): ProtectedUser() {
    init {
        setCompanyName("Neosoft")
    }
}

