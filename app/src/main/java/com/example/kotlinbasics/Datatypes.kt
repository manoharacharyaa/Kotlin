package com.example.kotlinbasics

fun main(){
    //Int types (by default the val is int)
//myByte:Byte=12 (specifying the val Byte explicitly)
    val myBte: Byte = 12 //8-bit
    val myShort: Short = 125 //16-bit
    val myInt = 123123123 //32-bit
    val myLong: Long = 39_812_309_487_120_300 //64-bit

//Floating point number types
    val myFloat: Float = 13.37F //32-bit
    val myDouble: Double = 3.14159265358979323846 //64-bit

//Boolean types
    var isSunny = true
    var isRaining = false

//Characters type
    val letterChar = 'A'
    val digitChar = '1'

//String type
    val myStr = "Hello World"
    val firstChar = myStr[0]
    var lastChar = myStr[myStr.length - 1]
    var myLength = myStr.length
    println("First character $firstChar and the length of mtStr is ${myStr.length}")
}

