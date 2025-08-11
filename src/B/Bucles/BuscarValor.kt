fun main() {
    val numeros = listOf(3, 5, 1, 4, 7, 9, 2)
    var index = 0
    var encontrado = false

    while (index < numeros.size) {
        if (numeros[index] == 7) {
            println("¡Número 7 encontrado en la posición $index!")
            encontrado = true
            break
        }
        index++
    }

    if (!encontrado) {
        println("El número 7 no está en la lista.")
    }
}
