package com.example.kotlinintro

fun main(){
/*
*List
* ArrayList
* listOf
* list Methods(invoking list methods)
*
 */


    //listOf Example
//    NOTE: listOf is immutable
    val listOfExample: List<String> = listOf<String>("Grey","white","Purple")
    println(listOfExample)

    //mutableListOf Example
    val mutableListExmple = mutableListOf("lema","jack")

    //invoking list methods
//    NOTE: not that there are methods available for mutable list(can be modified) and imutable list
    listOfExample.forEach { println("Names of individuals in the classroom $it") }


}