package com.erickmarques.collections

fun main(){
    val jose = Funcionario("José",2000.0,"PJ")
    val carla = Funcionario("Carla", 1700.0,"CLT")
    val gabriel = Funcionario("Gabriel", 1200.0,"PJ")
    val mariane = Funcionario("Mariane", 1800.0, "PJ")

    val funcionarios = setOf(jose, carla, mariane)
    val funcionarios2 = setOf(mariane, gabriel)

    println("---UNIÃO---")
    val resultUnion = funcionarios.union(funcionarios2)
    resultUnion.forEach { println(it)}
    println("\n-----------------------------\n")

    println("---SUBTRAÇÃO---")
    val resultSubtract = funcionarios.subtract(funcionarios2)
    resultSubtract.forEach { println(it)}
    println("\n-----------------------------\n")

    println("---INTERSECÇÃO---")
    val resultIntersection = funcionarios.intersect(funcionarios2)
    resultIntersection.forEach {println(it)}
}