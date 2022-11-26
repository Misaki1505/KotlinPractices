package com.example.kotlinpractices

fun main(args: Array<String>) {
    val names = arrayListOf("Alice", "Bob", "Carlos", "Dan")
    val myLambda = {name: String -> println("Hello There $name")}
    sayHello(names, myLambda)
}

fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit) {
    for (name in names)
        doSomething(name)
}