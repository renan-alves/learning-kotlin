package Fundamentos

import Fundamentos.Pacotea.simplesFunc as funcaoSimples
import Fundamentos.Pacotea.Coisa
import Fundamentos.Pacotea.FaceMoeda.CARA
import Fundamentos.pacoteb.*

fun main() {
    kotlin.io.println(funcaoSimples("OK"))

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)

    println("${soma(2, 3)} Subtracao: ${subtracao(8, 7)}")
}

