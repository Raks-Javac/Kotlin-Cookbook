package com.example.kotlinintro

fun main() {

    /*
    * if else block
    * when
    * For Loop
     */
println(checkIfWealthy(150))
    println(
        checkIfAdult(16)
    )
}


fun checkIfWealthy(amount: Int): String{

  val status : String =   when(amount){
      in  1..100 -> "isn't so wealthy"
      in 100..200 -> "So wealthy"
        else -> {
           "$amount you are doing well but not yet"
        }
    }
    return status
}


fun checkIfAdult(age: Int): String{
    return if(age>= 18){
        "Already an adult"
    }else{
        "Still not yet an adult"
    }
}