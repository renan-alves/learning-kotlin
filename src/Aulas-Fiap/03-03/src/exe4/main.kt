package exe4

fun main() {

    val listaUsuarios = listOf(
        User(1, "CTeste1"),
        User(4, "ATeste2"),
        User(3, "BTeste3")
    )

    val ordenados = ordernar(listaUsuarios)
    ordenados.forEach(){
        println(it.toString())
    }
}

fun ordernar(listaUsuarios: List<User>): List<User> {
    return listaUsuarios.sortedBy { it.s }
}
