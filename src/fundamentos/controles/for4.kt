package fundamentos.controles

fun main() {
    val alunos = arrayListOf("Andre", "Carlos", "Marcos")

    for ((indice, aluno) in alunos.withIndex()){
        println("${indice + 1} - $aluno")
    }
}