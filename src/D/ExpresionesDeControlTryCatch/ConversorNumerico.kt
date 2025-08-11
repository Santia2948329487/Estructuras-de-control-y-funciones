fun main() {
    print("Ingresa un número en texto: ")
    val entrada = readLine()

    try {
        val numero = entrada?.toInt() ?: throw NumberFormatException()
        println("Número convertido exitosamente: $numero")
    } catch (e: NumberFormatException) {
        println("Error: No se pudo convertir el texto a número.")
    }
}
