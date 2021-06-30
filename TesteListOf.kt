package com.erickmarques.collections

fun main() {
    val pedro = Funcionario("Pedro", 1800.0, "CLT")
    val valquiria = Funcionario("Valquiria", 1950.0, "PJ")
    val joao = Funcionario("João Carlos", 1500.0,"PJ")

    val funcionarios = listOf<Funcionario>(pedro, valquiria, joao)

    funcionarios.forEach{println(it)}
    println("\n-----------------------------\n")

    println(funcionarios.find{it.nome == "Valquiria"})
    println("\n-----------------------------\n")

    funcionarios.sortedBy { it.salario }.forEach{ println(it)}
    println("\n-----------------------------\n")

    funcionarios.groupBy { it.tipoContratacao }.forEach{ println(it)}

    
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString() =
        """
            Nome: $nome
            Salário: R$$salario
            
        """.trimIndent()
}