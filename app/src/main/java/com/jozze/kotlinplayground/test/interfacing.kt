package com.jozze.kotlinplayground.test

import android.app.Application

interface Actionable {
    val testInstanceVariable: String

    fun doSomeAction()
}

interface ChildActionable : Actionable {
//    override fun doSomeAction() {
//
//    }
//
//    override val testInstanceVariable: String
//        get() = TODO("Not yet implemented")
}

// no multiple class inheritance in Kotlin
data class ChildClass(val name: String, val age: Int) : Actionable, ChildActionable, Application() {

    override val testInstanceVariable: String
        get() = TODO("Not yet implemented")

    override fun doSomeAction() {
        TODO("Not yet implemented")
    }

}

fun main() {
    val child = ChildClass("Joe", 28)
    child.copy(age = 8)
}