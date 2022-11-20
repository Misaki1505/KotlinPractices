package com.example.kotlinpractices

fun main(args: Array<String>) {
    for(i in 1..3) {
        val p1 = 2
        val p2 = 1
        println(addition(i*5, i*9))
    }
}

fun addition(p1: Int, p2: Int): Int {
    return p1 + p2
}