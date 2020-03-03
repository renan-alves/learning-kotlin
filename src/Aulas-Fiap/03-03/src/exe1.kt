import java.text.NumberFormat

fun main() {

    val valor: Double = 40.0
    println(valor.toCurrencyFormat())
}

fun Double.toCurrencyFormat(): String{
    return NumberFormat.getInstance().format(this);
}