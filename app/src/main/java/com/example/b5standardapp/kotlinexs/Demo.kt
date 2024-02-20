package com.example.b5standardapp.kotlinexs

import com.example.b5standardapp.kotlinexs.lamdas.LamdasDemo
import com.example.b5standardapp.kotlinexs.lamdas.ReceiverPhone
import com.example.b5standardapp.kotlinexs.lamdas.SayImpl
import com.example.b5standardapp.kotlinexs.lamdas.Sayable

class Demo{}

/*fun main() {
   // birthdayGreeting()
    //life before lamdas
    var sayimpl = SayImpl()
    sayimpl.say("--how are you")
}*/

fun birthdayGreeting() {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}


fun main() {
    var ldemo = LamdasDemo()
    var receptionist = ReceiverPhone()
    ldemo.ansariAdd(30,40,receptionist)

    // All examples create a function object that performs upper-casing.
    // So it's a function from String to String

    val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1

    val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2

    val upperCase3 = { str: String -> str.uppercase() }                     // 3

    // val upperCase4 = { str -> str.uppercase() }                          // 4

    val upperCase5: (String) -> String = { it.uppercase() }                 // 5

    val upperCase6: (String) -> String = String::uppercase                  // 6

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
    println(upperCase7("hello"))
}

fun upperCase7(str:String):String{
    return  str.uppercase()
}