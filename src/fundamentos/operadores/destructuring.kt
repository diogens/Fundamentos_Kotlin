package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main() {
    val (a, b) = Carro(marca = "Ford", modelo = "Fusion")
    println("$a $b")

    val (marido, mulher) = listOf("João", "Maria")
    println("$marido e $mulher")

    val(_, _, terceiroLugar) = listOf("Kimi", "Hammilton", "Alonso")
    println("$terceiroLugar terminou em Terceiro lugar")
}