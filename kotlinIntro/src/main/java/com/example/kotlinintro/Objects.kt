package com.example.kotlinintro


fun main(){
    //NOTE: initially all classes in kotlin are closed

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
  val raceObject = Race();
    println(raceObject.getRaceStatus())
    println(Race("On your mark").getRaceStatus())

    //inheritance and override concept
    Son().canRead();

}


//Object creation
class  School (students: List<String> = mutableListOf(),name: String) {
 private val students = students
    private  val schoolName: String = name

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



// Init Concept
class Race(private var mark:String= ""){
    init {

        if(mark.isEmpty())
            mark = "Get Set"
        else
            mark = "stop"


    }


 fun getRaceStatus():String{
       return mark

    }
}



// Inheritance and Override

open class Father{
    open fun canRead(){
        println("Ability to read from father")
    }
}


class Son : Father() {

override fun canRead(){
    super.canRead()
    println("Ability to read from Son")
}
}


