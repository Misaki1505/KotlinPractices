package com.example.kotlinpractices

fun main(args: Array<String>) {
    println(sumOfIntegers(4, 8, 5, 2, 6, 43, 5, 6))
    println(sumOfIntegers(85, 5, 9, 74, 105))
}

fun sumOfIntegers(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}