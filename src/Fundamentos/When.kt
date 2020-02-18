package Fundamentos

fun main() {

    val nota = 0

    when(nota){
        10, 9 -> println("Muito bom")
        8, 7 -> println("Bom")
        5, 6 -> println("Regular")
        in 1..4 -> println("Ruim")
        else -> println("Reprovado")
    }
}