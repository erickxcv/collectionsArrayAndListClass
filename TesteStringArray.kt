package com.erickmarques.collections

fun main(){
    val nomes = Array<String>(3){""}
    nomes[0]="Veronica"
    nomes[1]="Tiana"
    nomes[2]= "Monica"

    val nomes2 = arrayOf("Patricia","Ana","Daniela")

    for(nome in nomes){
        println(nome)
    }
    println("\n---------------------\n")
    nomes.forEach{ println(it)}

    nomes2.forEach{ println(it)}

    nomes2.sort()
    println("\n---------------------\n")
    nomes2.forEach { println(it) }


}