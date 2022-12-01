package com.example.kotlinpractices

fun main(args: Array<String>) {
    val client = listOf("Alice", "Bob", "Sandra","Susana")
    client.filter { it.length < 5 }
    .forEach { println("Hello $it") }

    val number = setOf(3, 546, 88, 102, 91, 15, 1542)
    println(number.filter{ it in 10..99})

    val clients = listOf("Tom", "Laura", "León", "Clara", "Robin")
    println(clients.sortedBy { it[it.length-1] })

    val ints = listOf(295, 895, 784, 126, 542, 982)
    println(ints.maxBy { it / 10 % 10 })
}