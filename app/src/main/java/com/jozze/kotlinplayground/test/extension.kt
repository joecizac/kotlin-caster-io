@file:JvmName("StringFunctions")

package com.jozze.kotlinplayground.test

import java.util.*

fun main() {
    "Hey There".let {
        val split = it.split(' ')
        println(it.initials(split[0], split[1]))
    }
}

fun String.initials(firstName: String, lastName: String): String {
    return "$this = " +
            "${firstName.substring(0, 1).toUpperCase(Locale.ROOT)}${lastName.substring(0, 1).toUpperCase(Locale.ROOT)}"
}