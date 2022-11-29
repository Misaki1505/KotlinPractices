package com.example.kotlinpractices

fun main(args: Array<String>) {
    val client = listOf("Alice", "Bob", "Sandra","Susana")
    client.filter { it.length < 5 }
    .forEach { println("Hello $it") }
}