package com.example.kotlinintro

fun main() {
    // kotlin opetor

    /*
    * * , + , - , and % (Arithmetic)
    * && , || and ! (Logical)
    * === and !== (Referential equality operators(if and only if)
    * Comparison Operators (< , <= , > , >= )
    * ?: (Takes the right hand if the left hand is null)
     */


    //1
    val n1: Int
    val n2: Int
    n1 = 1
    n2 = 4
    var n3: Int = n1 + n2
    n3 = 1 / 3
    n3 = 1 - 2
    n3 = 1 % 3
    println(n3)

    //2

    val nm1 = 4
    val nm2 = 4
    println(nm1 === nm2)


}