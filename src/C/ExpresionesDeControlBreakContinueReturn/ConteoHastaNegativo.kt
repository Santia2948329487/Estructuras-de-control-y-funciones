fun main() {
    val numeros = listOf(4, 7, 3, -2, 5, 1)
    var suma = 0

    for (num in numeros) {
        if (num < 0) {
            println("Número negativo encontrado: $num. Se detiene la suma.")
            break
        }
        suma += num
    }

    println("Suma acumulada hasta el negativo: $suma")
}
