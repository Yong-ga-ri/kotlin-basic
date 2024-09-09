package com.varchar6.petcast

import java.util.*

fun main() {
//    var name
//    name = "John"
//    println(name)

    var name: String
    name = "John"
    println(name)

    var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is: " + txt.length)

    var txt1 = "Hello World"
    println(txt1.uppercase(Locale.getDefault()))   // Outputs "HELLO WORLD"
    println(txt1.lowercase(Locale.getDefault()))   // Outputs "hello world"

    var txt11 = "Hello World"
    var txt21 = "Hello World"
    println(txt11.compareTo(txt21))  // Outputs 0 (they are equal)

    var txt3 = "Please locate where 'locate' occurs!"
    println(txt3.indexOf("locate"))  // Outputs 7

    var firstName = "John "
    var lastName = "Doe"
    println(firstName.plus(lastName))

    var firstName1 = "John"
    var lastName1 = "Doe"
    println("My name is $firstName1 $lastName1")
}