fun indicePrimeraVocal(texto: String): Int {
    val vocales = setOf('a', 'e', 'i', 'o', 'u')

    for ((indice, letra) in texto.lowercase().withIndex()) {
        if (letra in vocales) {
            return indice
        }
    }

    return -1 // Si no se encuentra ninguna vocal
}

fun main() {
    val palabra = "krptn"
    val indice = indicePrimeraVocal(palabra)

    if (indice != -1) {
        println("La primera vocal está en la posición: $indice")
    } else {
        println("No se encontró ninguna vocal.")
    }
}
