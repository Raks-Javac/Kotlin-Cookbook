package com.example.kotlinintro


fun main(){

    getCurrentState(Repository.getCurrentState())
    Repository.startLoading()
    getCurrentState(Repository.getCurrentState())
    Repository.finishedFetch()
    getCurrentState(Repository.getCurrentState())
    Repository.error()
    getCurrentState(Repository.getCurrentState())
}



sealed class  Result

data class  SUCCESS(val data: String): Result()
data class ERROR(val error: Exception): Result()
object FAILED : Result()
object IDLE: Result()
object LOADING: Result()




fun getCurrentState(status: Result){
    when(status){
        is SUCCESS -> {
            println("Success!")
        }
     is FAILED -> {
            println("Failure!")
        }
  is IDLE -> {
            println("Idle")
        }
       is LOADING -> {
            println("Loading...")
        }
     is ERROR -> {
            println("Error! ${status.error.message}")
        }
    }
}



object  Repository{
    private var loadingState: Result = IDLE
    private var dataFetched: String? = ""

   fun startLoading(){
       loadingState = LOADING

   }

    fun finishedFetch(){
        loadingState = SUCCESS("")

    }

    fun error(){
        loadingState = ERROR(Exception("Could not load data"))
    }

    fun getCurrentState():Result{
        return loadingState
    }



}



