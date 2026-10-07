class LivroReceitas {
    private val receitas = mutableListOf<Receita>()

    fun adicionar(receita: Receita) {
        receitas.add(receita)
    }

    fun exibirTodas(dobrarRendimento: Boolean) {
        for (receita in receitas) {
            receita.exibir(dobrarRendimento)
        }
    }
}