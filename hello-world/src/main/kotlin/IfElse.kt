package com.varchar6.petcast

fun main() {
    val time = 20
    val greeting = if (time < 18) {
        "Good day."
    } else {        // 필기. 반환값이 존재하는 표현식으로 사용될 때는, 반드시 else문이 필요
        "Good evening."
    }
    println(greeting) // 필기. java의 삼중 조건문과 동일
}