package com.example.kotlinbasics
//Assignment Operator (|+=|-=|*=|/=|%=|)
//Increment & Decrement Operators (|++|--|)
fun main(){
    var add = 5
    add += 3
    println("add is $add")
    println("add++ is ${add++}")
    println("++add is ${++add}")

    var sub = 5
    sub -= 3
    println("sub is $sub")
    println("sub-- is ${sub--}")
    println("--sub is ${--sub}")

    var mult = 5
    mult *= 3
    println("mult is $mult")

    var div = 5
    div /= 3
    println("div is $div")

    var mod = 5
    mod %= 3
    println("mod is $mod")
}