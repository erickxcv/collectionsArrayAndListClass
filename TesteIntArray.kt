package com.erickmarques.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1]= 4
    values[2]=34
    values[3]= 13
    values[4]= 0

    for(valor in values){
        println(valor)
    }

    println("\n---------------------\n")

    for(index in values.indices){
        println(values[index])
    }

    println("\n---------------------\n")
    values.sort()

    values.forEach { println(it) }
}