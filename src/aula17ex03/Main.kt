package aula17ex03

fun main(){
    val filme1 = Filme("Titanic", 194)
    filme1.titulo = "Os Vingadores"
    filme1.duracaoEmMinutos = 142
    filme1.exibirDuracaoEmHoras()

    val filme2 = Filme("Hotel Transilvânia", 93)
    filme2.exibirDuracaoEmHoras()
    println("Os filmes em cartaz são '${filme1.titulo}' e '${filme2.titulo}'.\n")

    val filme = ArrayList<Filme>()

    filme.add(Filme("A Sociedade Literária e a Torta de Casca de Batata", 124))
    filme.add(Filme("Eterno Brilho de uma Mente sem Lembranças", 108))
    filme.add(Filme("A Sociedade dos Poetas Mortos", 128))
    filme.add(Filme("O Farol das Orcas", 110))
    filme.add(Filme("Green Book", 130))

    println("==> Filmes em cartaz: <==")
    filme.forEach{filme ->
        print("===================================\n${filme.titulo}\n${filme.duracaoEmMinutos}min de duração\n")
    }
}