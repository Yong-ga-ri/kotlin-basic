package com.varchar6.petcast

fun main() {
    var name = "John"
    val birthyear = 1975

    println(name)          // Print the value of name
    println(birthyear)     // Print the value of birthyear

    name = "John1"
//    birthyear = 1975        // compile error

    // 설명. 타입 명시 가능
    var name1: String = "John"
    val birthyear1: Int = 1975

    // 설명. 타입을 명시할 때만 초기화하지 않은 변수를 선언 가능
    //      val: 주로 상수 선언 시 사용하겠다.
//    var name2
    name = "John"
    println(name)

    var name11 = "John"
    name11 = "Robert"
    println(name11)

    val firstName = "John "
    val lastName = "Doe"
    val fullName = firstName + lastName
    println("fullName: $fullName")

    val x = 5
    val y = 6
    println(x + y) // Print the value of x + y
    println("5 + y" + "5" + y)

    // 설명. 할당된 값으로 변수의 데이터타입이 정의된다.
    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    // 설명. 데이터타입 정의도 가능하다.
    val myNum1: Int = 5                // Int
    val myDoubleNum1: Double = 5.99    // Double
    val myLetter1: Char = 'D'          // Char
    val myBoolean1: Boolean = true     // Boolean
    val myText1: String = "Hello"      // String

    // 설명. E는 10의 계수
    val myNum11: Float = 35E3F
    val myNum21: Double = 12E4
    println(myNum11)
    println(myNum21)

    // 설명. java와 다르게 char에 int를 담을 수 없다.
//    val myGrade: Char = 66
//    println(myGrade)

    // 설명. toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar()으로 변형 가능
    val x1: Int = 5
    val y1: Long = x1.toLong()
    println(y1)


}