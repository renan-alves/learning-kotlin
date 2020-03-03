package exe5

import java.text.NumberFormat

fun main() {

    val banks = listOf(
        BankAccount("Itau", 200.0),
        BankAccount("Banco do Brasil", 0.0),
        BankAccount("Bradesco"),
        BankAccount("Nu Bank", 500.0),
        BankAccount("Neon", null)
    )

    banks.forEach {b->
        b.valor?.let {
            println("O banco ${b.nome} possui um total de ${it.toCurrencyFormat()}")
        }
    }
}

fun Double.toCurrencyFormat(): String{
    return NumberFormat.getInstance().format(this);
}