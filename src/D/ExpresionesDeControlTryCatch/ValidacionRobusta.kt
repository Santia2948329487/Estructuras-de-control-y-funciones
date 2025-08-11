fun convertirANumeroSeguro(texto: String): Int {
    return try {
        texto.toInt()
    } catch (e: NumberFormatException) {
        0
    }
}

fun main() {
    print("Ingresa un número en texto: ")
    val entrada = readLine() ?: ""

    val resultado = convertirANumeroSeguro(entrada)
    println("Número convertido (o 0 si hubo error): $resultado")
}
