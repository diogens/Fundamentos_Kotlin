package fundamentos.controles

fun main() {
    val nota = -10

    when(nota){
        10, 9 -> println("Fantástico")
        8, 7 -> println("Parabéns")
        6, 5, 4 -> print("Tem com Recuperar")
        in 0..3 ->println("Te vejo no proximo semestre")
        else ->println("Nota invalida")
    }
}