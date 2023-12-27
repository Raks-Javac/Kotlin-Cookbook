package com.example.kotlinintro


fun main(){
    val employeeData = Employee(employeeID = 29381637,
        employeeCompany = "Google",
        employeeName = "Jay Clown"
        )

    println(employeeData)
    println(employeeData.copy(employeeName = "Micheal Lambda"))


}

data class Employee(val employeeID:Int,val employeeName:String,val employeeCompany:String)