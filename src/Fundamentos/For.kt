package Fundamentos

fun main() {

//    for(i in 1..10){
//        println(i)
//    }
//
//    for (i in 10 downTo 1){
//        println("i = $i")
//    }
//
//    for(i in 0..50 step 5){
//        println("Valor = $i")
//    }
//
//    for(i in 100 downTo 0 step 10){
//        println("Valord = $i")
//    }

    val alunos = arrayListOf("Drausio", "Fabio", "Pedro")

    for((i, aluno) in alunos.withIndex()){
        println("Aluno: $aluno, $i")
    }
}