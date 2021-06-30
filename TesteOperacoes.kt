package com.erickmarques.collections

fun main() {
    val salarios = DoubleArray(5)
    salarios[0] = 1500.0
    salarios[1] = 2600.0
    salarios[2]= 700.0
    salarios[3] = 2000.0
    salarios[4] = 3200.0

    //val salarios2 = doubleArrayOf(1200.0, 1700.0, 1300.5)

    for(salario in salarios){
        println("R$$salario")
    }
    println("\n---------------------\n")
    println("Maior salário: R$${salarios.maxOrNull()}" +
            "\nMenor salário: R$${salarios.minOrNull()}" +
            "\nMédia salarial: R$${salarios.average()}")

    println("\n---------------------\n")

    val salarioMedio = salarios.average()
    println("Salário(s) acima da média:")
    val salarioMaiorQueMedia = salarios.filter { (it>salarioMedio) }
    salarioMaiorQueMedia.forEach{println("R$$it")}
    println("Quantidade de salários acima da média: "+salarios.count { (it>salarioMedio) })
    //find
    if(salarios.find{(it == salarioMedio)} == salarioMedio){
        println("Existe um salário com o valor da média salarial")
    }
    else{
        println("Nenhum salário com o valor da média salarial foi encontrado")
    }

    //any retorna true ou false
}