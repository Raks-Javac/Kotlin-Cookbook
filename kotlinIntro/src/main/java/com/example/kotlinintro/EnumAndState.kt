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



enum class Result{
    SUCCESS,
    FAILED,
    IDLE,
    LOADING,
    ERROR
}


fun getCurrentState(status: Result):Unit{
    when(status){
        Result.SUCCESS -> println("Success!")
        Result.FAILED -> println("Failure!")
        Result.IDLE -> println("Idle")
        Result.LOADING -> println("Loading...")
        Result.ERROR -> println("Error!")
    }
}


object  Repository{
    private var loadingState: Result = Result.IDLE
    private var dataFetched: String? = ""

   fun startLoading(){
       loadingState = Result.LOADING

   }

    fun finishedFetch(){
        loadingState = Result.SUCCESS
        dataFetched = null
    }

    fun error(){
        loadingState = Result.ERROR
    }

    fun getCurrentState():Result{
        return loadingState
    }

    fun getCurrentDataState(): String?{
        return  dataFetched
    }

}