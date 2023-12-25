package com.example.kotlinintro

fun main(){
/*
*List
* ArrayList
* listOf
* list Methods(invoking list methods)
* mutable Map and mutable Set Collection
* Mutable and immutableR
* Empty Collection
* Collection Filters
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

    //
    collectionFilters()


}



//immutable list collection list Of
fun returnListOf(): List<String> {
    return listOf("John", "Khalil", "Josiah");
}


//mutable map collection
fun mapCollection(): Unit {
    val mutableMapHere = mutableMapOf<String, Int>("Up" to 4,"David" to 7)
    mutableMapHere["Never"] = 9
    println(mutableMapHere)
}


// empty collections
fun emptyCollection(): Unit{
    val emptyMapHere = emptyMap<String,Int>();
    val emptySetHere = emptySet<String>()
    val emptyListHere = emptyList<Int>()
}

//collection filters


fun collectionFilters(): Unit{
   val studentCollection = mutableListOf<Int>()
    for(i in 1..10){
        studentCollection.add(i)
    }


  val newList =   studentCollection.forEach { it*it }
    println(" Student collection multiplied by preceeding $newList");


val fourList = studentCollection.filter { it == 4 }.contains(5)
    println("filtered list $fourList")

}






