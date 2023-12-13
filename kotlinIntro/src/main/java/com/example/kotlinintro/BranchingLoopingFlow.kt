package com.example.kotlinintro

fun main() {

    /*
    * if else block
    * when
    * For Loop
     */
println(checkIfWealthy(150))

    //
    println(
        checkIfAdult(16)
    )

    //
    evenNumberCheck(100)

    //
    multipleOf3NumberCheck(200)


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

fun evenNumberCheck(range: Int) : Unit {
    for(i in 1..range){
        if(i%2 == 0) println("even number $i") else println("$i is Odd")

    }



}

fun multipleOf3NumberCheck(range: Int) : Unit{
    var i : Int  = 1;
    while (i<range){
        i += 1;
        if(i%3  == 0) println("Multiple of 3 = $i") else println("$i not multiple of 3")
    }
}