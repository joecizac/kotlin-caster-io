package com.jozze.kotlinplayground.test

fun main() {

}

enum class GearType {
    DSG,
    DCT,
    AMT,
    MATIC
}

enum class Manufacturer(countryOfOrigin: String) {
    BMW("Germany"),
    GMC("USA"),
    LOTUS("Britain"),
    AUDI("Germany")
}