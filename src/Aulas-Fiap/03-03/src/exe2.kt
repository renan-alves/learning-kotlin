fun main() {

    val fullName = "Kassiano Resende"
    val fullName2 = "Kassiano"
    val fullName3 = "Kassiano Resende Teste"

    println(fullName.firstName()) //Kassiano
    println(fullName2.firstName()) //Kassiano
    println(fullName3.firstName()) //Kassiano
}

fun String.firstName(): String{
    return this.split(" ").first()
}