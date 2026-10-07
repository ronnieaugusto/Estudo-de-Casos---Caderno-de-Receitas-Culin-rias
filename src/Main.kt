fun main() {
    val bolo = Receita(
        nome = "Bolo de Cenoura",
        tempoPreparo = 50,
        porcoes = 8,
        codigoDificuldade = 2,
        ingredientes = listOf(
            Ingrediente("Cenoura", 3.0, "unidades"),
            Ingrediente("Farinha de trigo", 300.0, "g"),
            Ingrediente("Açúcar", 200.0, "g")
        ),
        dicaExtra = "Bata a cenoura com os ovos para ficar mais macio"
    )

    val brigadeiro = Receita(
        nome = "Brigadeiro",
        tempoPreparo = 20,
        porcoes = 20,
        codigoDificuldade = 1,
        ingredientes = listOf(
            Ingrediente("Leite condensado", 1.0, "lata"),
            Ingrediente("Chocolate em pó", 4.0, "colheres")
        )
    )

    val livro = LivroReceitas()
    livro.adicionar(bolo)
    livro.adicionar(brigadeiro)

    println("######## Rendimento normal ########")
    livro.exibirTodas(dobrarRendimento = false)

    println("######## Rendimento dobrado ########")
    livro.exibirTodas(dobrarRendimento = true)
}