package Fundamentos.Operadores

data class Carro(val marca: String, val modelo: String)

fun main() {
    val (marca, modelo) = Carro("Ford", "Fusion")

    println(marca)
    println(modelo)

    val (_, _, full) = listOf("Fabio", "Drausio", "Isa")

}