package com.example.kotlinpractices

fun main(args: Array<String>) {
    val numbers = arrayListOf(3, 8, 5, 52, 98, 354)
    println(numbers)
    val newNumbers = update(numbers) {number -> number/10}
    println(newNumbers)
}

fun update(numbers: ArrayList<Int>, lbd: (Int) -> Int): ArrayList<Int> {
    for(i in 0..numbers.size-1) {
        if(numbers[i] % 2 == 0)
            numbers[i] = lbd(numbers[i])
    }
    return numbers
}