package com.varchar6.petcast.tutorial

fun main() {
    val time = 20
    val greeting = if (time < 18) {
        "Good day."
    } else {        // 필기. 반환값이 존재하는 표현식으로 사용될 때는, 반드시 else문이 필요
        "Good evening."
    }

    // 설명. 반환되는 표현식으로 사용되는 조건문의 반환타입은 Unit 반환
    //      Unit: 값을 반환하지 않는 함수에서 반환하는 타입

    println(greeting) // 필기. java의 삼중 조건문과 동일
}