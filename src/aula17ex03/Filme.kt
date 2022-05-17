package aula17ex03

class Filme(var titulo: String, var duracaoEmMinutos: Int){
    fun exibirDuracaoEmHoras(){
        var horas = duracaoEmMinutos / 60
        var minutos = duracaoEmMinutos % 60
        println("O filme $titulo possui $horas horas e $minutos minutos de duração.")
    }
}