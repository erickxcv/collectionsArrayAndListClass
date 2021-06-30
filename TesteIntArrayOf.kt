package com.erickmarques.collections

fun main() {
    val values = intArrayOf(5, 4, 3, 6, 8, 9)

    for(valor in values){
        println(valor)
    }
    println("\n---------------------\n")
    values.forEach { println(it) }

    println("\n---------------------\n")
    values.sort()

    for(index in values.indices){
        println(values[index])
    }
}