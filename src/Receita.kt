class Receita(
    val nome: String,
    val tempoPreparo: Int,
    val porcoes: Int,
    val codigoDificuldade: Int,
    val ingredientes: List<Ingrediente>,
    val dicaExtra: String? = null
) {

    fun nivelDificuldade(): String {
        return when (codigoDificuldade) {
            1 -> "Fácil"
            2 -> "Médio"
            3 -> "Difícil"
            else -> "Dificuldade inválida"
        }
    }

    fun exibir(dobrarRendimento: Boolean) {
        val fator: Int
        if (dobrarRendimento) {
            fator = 2
        } else {
            fator = 1
        }

        println("===== $nome =====")
        println("Dificuldade: ${nivelDificuldade()}")
        println("Tempo de preparo: ${tempoPreparo * fator} minutos")
        println("Porções: ${porcoes * fator}")

        println("Ingredientes:")
        for (ingrediente in ingredientes) {
            val quantidadeFinal = ingrediente.quantidade * fator
            println("- ${ingrediente.nome}: $quantidadeFinal ${ingrediente.unidade}")
        }

        println("Dica do chef: ${dicaExtra ?: "Nenhuma dica disponível para esta receita"}")
        println()
    }
}