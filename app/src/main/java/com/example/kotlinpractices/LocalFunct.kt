package com.example.kotlinpractices

fun main(args: Array<String>) {
    listAnimals()
}

fun listAnimals() {
    fun listOneAnimal(animal: String) {
        println("I have a $animal")
    }

    val animals = listOf("cat", "dog", "snake", "hamster")
    for(animal in animals) {
        listOneAnimal(animal)
    }
}