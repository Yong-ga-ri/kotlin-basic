package com.varchar6.petcast.tutorial

fun main() {
    var i = 0
    while (i < 10) {
        if (i == 4) {
            i++
            continue
        }
        println(i)
        i++
    }
}