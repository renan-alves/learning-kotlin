fun main() {

    val nota = listOf(5, 6, 7, 8)
    var result = 0.0
    for (i in 0..3){
        result += nota[i]
    }

    println("A média é: ${result/nota.size}")
}