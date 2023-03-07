package com.example.kotlinbasics
// var & val
fun main(){
    var myName = "Manohar"
    myName = "Virat"
//  println("Hello " + myName)
    println("Hello  $myName") //string interpolation(same as + myName)

    val mySurname = "Acharya"
//  mySurname = "Kohli"
    println("Hello " + mySurname)

}

//Diff between var & val
//var can be overwritten
//val can't be overwritten

