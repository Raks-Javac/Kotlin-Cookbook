package com.example.kotlinintro


fun main(){
    /*
    * Function Parameters
    * Default Arguments
    * Named Arguments
    * Functions and its return types (Basic DataTypes and Unit"Void")
     */


    //
    nameIt("myFirstName","myLastName")
    //
    timesTable()
    //
    dogName(firstDog = "Mal")
    //
    returnInt(4)
    //
    returnNoValue()


}


//Function Parameters
fun nameIt(firstName: String, lastName: String) {
    println("First Name is $firstName and lastName is $lastName")
}

//Default Arguments

fun timesTable(from: Int = 1, multiple: Int = 10){
    for(i in from..multiple){
        println("$i x $multiple  = ${i*multiple}")
    }
}


//Named Arguments

fun dogName(firstDog: String){
    print("Dog name is $firstDog")
}



//Functions and its return types


//return integer
fun returnInt(intValue: Int) : Int{
    return intValue;
}

//return bool
fun integerIsMultipleOf2(intValue: Int) : Boolean {
    return intValue % 2 == 0;
}


//function with no return value

fun returnNoValue(): Unit{

}