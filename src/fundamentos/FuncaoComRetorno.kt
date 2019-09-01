package fundamentos

fun soma(a: Int, b: Int = 1): Int {
    return a + b
}

fun main() {
    println(soma(4,10))
    println(soma(11))
}