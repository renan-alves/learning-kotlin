package Fundamentos

fun main() {
    var a: Int? = null
    print(a?.inc())

    print(a!!.inc()) //Forçando a chamada de método com !!
}