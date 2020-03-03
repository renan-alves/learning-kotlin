fun main() {

    val fullName = "Kassiano Resende"
    val fullName2 = "Kassiano"
    val fullName3 = "Kassiano Resende Teste"

    println(fullName.lastName()) //Resende
    println(fullName2.lastName()) //Kassiano
    println(fullName3.lastName()) //Teste
}

fun String.lastName(): String{

    val strings = this.split(" ")
    return strings.last()
}