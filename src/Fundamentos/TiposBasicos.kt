package Fundamentos

fun main() {
    // Tipos numéricos inteiros e seus valoresd máximos
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647 //Separador válido
    val num4: Long = 9223372036846775807 // Long.MAX_VALUE

    //Tipos reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    //Tipo caractere
    val char: Char = 'a'

    //Tipo booleano
    val boolean: Boolean = false // ou false

    println(listOf(num1, num2, num3, num6, char, boolean))

    //Tudo é objeto
}