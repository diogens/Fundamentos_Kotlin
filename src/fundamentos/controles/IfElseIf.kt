package fundamentos.controles

fun main() {
    val nota: Double = 1.3

    //Usando o operador range
    if(nota in 9..10) {
        println("Fantastico")
    }else if (nota in 7..8) {
        println("Parabéns")
    }else if (nota in 4..6) {
        println("Tem como recuperar")
    }else{
        println("Si fufu")
    }
}