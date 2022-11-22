package com.example.kotlinpractices

fun main(args: Array<String>) {
    println(multiply(5))
    println(multiply(7,9))
}

fun multiply(number: Int) = number * 2

fun multiply(number: Int, multiplier: Int) = number * multiplier