fun primerMultiploDeCuatro(lista: List<Int>): Int? {
    for (numero in lista) {
        if (numero % 4 == 0) {
            return numero
        }
    }
    return null // Si no se encuentra ninguno
}

fun main() {
    val numeros = listOf(3, 7, 10, 8, 15, 20)
    val resultado = primerMultiploDeCuatro(numeros)

    if (resultado != null) {
        println("Primer múltiplo de 4 encontrado: $resultado")
    } else {
        println("No se encontró ningún múltiplo de 4.")
    }
}
