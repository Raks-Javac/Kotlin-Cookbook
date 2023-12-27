package com.example.kotlinintro

fun main() {

    //Passing list of strings
      val itemsList = listOf("Manie","Rose","Janet")
    Finder(itemsList).findItem("Manie"){
        println("Item found $it")
    }
    //passing a data class
    val object1 = GenericsObject("Integer",1)
    val object2 = GenericsObject("String","2")
    val objectList = listOf<Any>(object1,object1)
    Finder(objectList).findItem(object1){
        println("Object found $it")
    }

}

//generic class
class Finder<T>(private val listItem: List<T>){
    fun findItem(element:T,found:(element:T?) ->Unit){
       val itemFound =  listItem.filter {
            it == element
        }

        if(itemFound.isNullOrEmpty()) found(null)
        else found(itemFound.first())

    }
}

//data class sample

data class GenericsObject<T>(val objectName:T, val objectType:T)
