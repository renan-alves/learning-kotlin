package Fundamentos.Controle

fun main() {

    val nota: Double = 5.3

    if(nota >= 7) {
        println("Aprovado")
    } else{
        println("Reprovado")
    }

    val num1: Int = 2
    val num2: Int = 3

    val maiorValor = if(num1>num2){
        println("Teste")
        num1
    } else{
        num2
    }

    println("O maior valor é $maiorValor")

    val notaAluno: Double = 8.1

    //Operado Range

    if(notaAluno in 9.0..10.0){
        println("MB")
    } else if( notaAluno in 6.0..8.9){
        println("B")
    } else if(notaAluno in 0.0..5.0){
        println("I")
    }
}