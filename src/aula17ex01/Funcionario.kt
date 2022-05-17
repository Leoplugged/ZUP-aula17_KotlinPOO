package aula17ex01

class Funcionario(var nome: String, var sobrenome: String, var horasTrabalhadas: Double, var valorPorHora: Double){
    fun nomeCompleto(){
        println("$nome $sobrenome")
    }
    fun calcularSalario(){
        val salario = horasTrabalhadas * valorPorHora
        println("R$ $salario\n")
    }
    fun incrementarHoras(horaExtra: Double){
        horasTrabalhadas += horaExtra
    }
}