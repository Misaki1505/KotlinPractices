package com.example.kotlinpractices

fun main(args: Array<String>) {
    println(multiply(5))
    println(multiply(7,9))

    feedAnimal("cat")
    feedAnimal(setOf("dog", "bear", "shark"))
}

fun multiply(number: Int) = number * 2

fun multiply(number: Int, multiplier: Int) = number * multiplier

fun feedAnimal(animal: String) {
    println("Feeding the $animal")
}

fun feedAnimal(animals: Collection<String>) {
    for(animal in animals) {
        feedAnimal(animal)
    }
}