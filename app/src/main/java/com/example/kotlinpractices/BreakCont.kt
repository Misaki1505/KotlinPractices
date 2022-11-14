package com.example.kotlinpractices

fun main(args: Array<String>) {
    var onlyEvenNumbers = arrayListOf(2, 6, 4, 7, 8, 10)
    for(number in onlyEvenNumbers) {
        if(number % 2 != 0)
            break
        println("half of $number is ${number/2}")
    }
}