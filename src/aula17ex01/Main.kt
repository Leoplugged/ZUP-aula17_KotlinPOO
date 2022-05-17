package aula17ex01

fun main(){
    val novoFuncionario = Funcionario("Luis", "Silva", 10.0, 25.5)

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8.0)
    novoFuncionario.calcularSalario()

    val listaFuncionarios = ArrayList<Funcionario>()

    val func = Funcionario("Arwen", "Undómiel", 40.0, 23.5)
    listaFuncionarios.add(func)

    val func1 = Funcionario("Lagertha", "Skjaldmö", 20.0, 30.5)
    listaFuncionarios.add(func1)

    val func2 = Funcionario("Björn", "Ironside", 30.0, 20.0)
    listaFuncionarios.add(func2)

    val func3 = Funcionario("Aragorn", "Telcontar", 12.0, 15.0)
    listaFuncionarios.add(func3)

    val func4 = Funcionario("Ragnar", "Löthbrok", 40.0, 23.5)
    listaFuncionarios.add(func4)

    val func5 = Funcionario("Derfel", "Cadarn", 38.0, 28.9)
    listaFuncionarios.add(func5)

    val func6 = Funcionario("Derfel", "Cadarn", 38.0, 28.9)
    listaFuncionarios.add(func6)

    val func7 = Funcionario("Mr.", "Wednesday", 40.0, 23.5)
    listaFuncionarios.add(func7)

    val func8 = Funcionario("Bilquis", "Sheba", 20.0, 30.5)
    listaFuncionarios.add(func8)

    val func9 = Funcionario("Maria", "Helena", 12.0, 15.0)
    listaFuncionarios.add(func9)
    
    listaFuncionarios.forEach { i ->
        i.nomeCompleto()
        i.calcularSalario()
    }
}