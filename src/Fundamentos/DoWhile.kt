package Fundamentos

fun main() {
    var opcao = 0

    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Opção: $opcao")
    } while (opcao != -1)

    print("fim")
}