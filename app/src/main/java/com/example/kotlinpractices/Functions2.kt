package com.example.kotlinpractices

fun main(args: Array<String>) {
    val r = 10
    val area = calculateCircleArea(r)
    println("A circle with the radius $r has an area of $area")

}

fun calculateCircleArea(radius: Int): Double {
    val pi = 3.1415
    return pi * radius * radius
}