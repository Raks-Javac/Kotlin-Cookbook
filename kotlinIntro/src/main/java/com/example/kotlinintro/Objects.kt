package com.example.kotlinintro


fun main(){
    //school concept
    val firstSchool: School = School(
        mutableListOf("John","Kate"),
        "First Pavilion"
    )

    //
    val secondSchool: School = School(
        mutableListOf("John","Loan","Avalin"),
        "landmark"
    )

    println(firstSchool.getSchoolName())
    println(firstSchool.getStudentNames())
    println(firstSchool.getStudentCount())

    //
    println(secondSchool.getSchoolName())
    println(secondSchool.getStudentNames())
    println(secondSchool.getStudentCount())


    //init concept

}
class  School (students: List<String> = mutableListOf(),name: String) {
 private val students = students;
    private  val schoolName: String = name;

   fun getStudentCount(): Int{
        return students.size
    }


    fun getStudentNames(): List<String>{
        return students
    }

    fun getSchoolName(): String{
        return schoolName
    }
}



//
class Race(private var mark:String= "run"){
    init {
        mark = "stop"
    }


   fun getRaceStatus():String{
       return mark

    }
}


