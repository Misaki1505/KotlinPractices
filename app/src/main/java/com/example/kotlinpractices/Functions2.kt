package com.example.kotlinpractices

fun main(args: Array<String>) {
    val r = 10
    val area = calculateCircleArea(r)
    println("A circle with the radius $r has an area of $area")

    val people = listOf("Ana", "Pao", "Wendy")
    for(person in people) {
        val message = personalisedGreeting(person)
        println(message)
    }
}

fun calculateCircleArea(radius: Int): Double {
    val pi = 3.1415
    return pi * radius * radius
}

fun personalisedGreeting(person: String): String {
    val greeting = when(person[0]) {
        'A' -> "Are you ok $person"
        'W' -> "What's up $person"
        else -> "Hi $person"
    }
    return greeting
}