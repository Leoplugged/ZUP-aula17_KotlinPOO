package aula17ex02

class Livros(val titulo: String, val qtdPaginas: Int, var paginasLidas: Int){
    fun verificarProgresso() {
        val porcentagem: Double = (paginasLidas.toDouble() * 100) / qtdPaginas
        println("Você já leu "+"%.2f".format(porcentagem)+"% do livro.")
    }
}
