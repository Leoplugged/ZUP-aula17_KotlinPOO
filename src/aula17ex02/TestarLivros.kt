package aula17ex02

fun main(){
    val livroFavorito = Livros("O Pequeno Príncipe", 98, 0)
    println("O livro '${livroFavorito.titulo}' possuí ${livroFavorito.qtdPaginas} páginas")

    livroFavorito.paginasLidas = 20
    livroFavorito.verificarProgresso()

    livroFavorito.paginasLidas = 50
    livroFavorito.verificarProgresso()

    val livro = ArrayList<Livros>()
    livro.add(Livros("Crime e Castigo", 780, 0))
    livro.add(Livros("Amor Líquido", 192, 53))
    livro.add(Livros("O Ovo de Cristal", 19, 0))
    livro.add(Livros("O Morro dos Ventos Uivantes", 313, 101))
    livro.add(Livros("A Divina Comédia", 894, 0))
    livro.add(Livros("Cem anos de solidão", 448, 0))
    livro.add(Livros("O Processo", 272, 0))
    livro.add(Livros("Ana Kariênina", 808, 0))
    livro.add(Livros("Lolita", 392, 392))
    livro.add(Livros("O Ensaio sobre a Cegueira", 312, 312))

    livro.forEach{ Livros ->
        println("===============================\n${Livros.titulo}\n${Livros.qtdPaginas}\n${Livros.paginasLidas}")
        Livros.verificarProgresso()
    }
}
