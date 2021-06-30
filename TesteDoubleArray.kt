package com.erickmarques.collections

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 1500.0
    salarios[1] = 2700.5
    salarios[2]= 780.0

    val salarios2 = doubleArrayOf(1200.0, 1700.0, 1300.5)

    for(salario in salarios){
        println(salario)
    }

    println("\n---------------------\n")

    salarios2.forEach { println(it) }

    println("\n---------------------\n")

    salarios.sort()

    for(index in salarios.indices){
        println(salarios[index])
    }
}