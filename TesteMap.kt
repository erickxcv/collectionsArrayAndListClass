package com.erickmarques.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Joao", 5000.0)
    val map1 = mapOf(pair)

    map1.forEach { (t, u) -> println("Chave: $t - Valor: $u")  }

    val map2 = mapOf("Andrea" to 2500.0,
    "Helena" to 3400.0)

    map2.forEach{ (t, u) -> println("Chave: $t - Valor: $u")  }
}