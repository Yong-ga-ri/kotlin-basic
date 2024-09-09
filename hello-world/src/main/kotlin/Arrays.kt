package com.varchar6.petcast

fun main() {
    val array: Array<String> = arrayOf("volvo", "Hello")

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
}