fun main() {
    val numeros = listOf(2, 3, 4, 5) // Puedes cambiar estos números si quieres

    var resultado = 1

    for (num in numeros) {
        resultado *= num
    }

    println("El resultado de la multiplicación acumulativa es: $resultado")
}
