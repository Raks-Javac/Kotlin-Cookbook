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
    val mutableListExample = mutableListOf("lema","jack")

    //invoking list methods for immutable list
//    NOTE: not that there are methods available for mutable list(can be modified) and imutable list
    listOfExample.forEach { println("Names of individuals in the classroom $it") }
    println("Size ${listOfExample.size}")
    println("Last ${listOfExample.last()}")
    println("Binary Search ${listOfExample.binarySearch("grey".uppercase())}")

    //invoking list methods for mutable list
    //add function
    mutableListExample.add("david")
    println(
        mutableListExample
    )
    //remove element and remove  at item index function
    mutableListExample.removeFirst()
    mutableListExample.removeAt(1)
  println(mutableListExample)

    


}