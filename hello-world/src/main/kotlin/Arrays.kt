package com.varchar6.petcast

fun main() {
    val array: Array<String> = arrayOf("volvo", "Hello")

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    val cars1 = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars1) {
        if(x == "BMW") {        // 필기. 표현식이 아닌 조건문일 때는 else가 굳이 올 필요는 없다.
            break;
        }
        println(x)
    }

    val nums = arrayOf("1", '5', 10, 15, 20)
    for (x in nums) {
        println(x)
    }

}