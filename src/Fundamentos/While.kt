package Fundamentos

fun main() {

    var entrada = 0

    while(entrada != -1){
        val line = readLine() ?: "0"
        entrada = line.toIntOrNull() ?: 0

        println(entrada)
    }

    var i = 0
    while(i < 5){
        println("Volta $i")
        i++
    }
}