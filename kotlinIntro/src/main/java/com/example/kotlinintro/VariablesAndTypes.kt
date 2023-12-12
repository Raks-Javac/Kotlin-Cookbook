package com.example.kotlinintro

fun main() {
    //var:  mutable can change in real  time
    var name = "Amos"
    name = "John"
    print(name)

    //val : immutable after initialization

    val name2 = "Amazing"
    //you cant do "name2 = "body";" after initializing
    print(name2)

    // can also be stored in memory before initialization
    val name3: String
    name3 = "great"


    print(name3)

    //Long ,int, Bytes and bit
    val longVar: Long = 839939
    val byteVar: Byte = 74 //max value of 127
    val bitVar = 2L // "L" here is a long
    val integer2: Int = 73834_9383
    val doubleNumber: Double = 8283.27474


    //print : all in the same line
    // println : all to the next ln
    println(integer2)
    print(integer2)

    //Type inference
    fun multiplyBy2(number: Double): Double = number / 2838.393


}