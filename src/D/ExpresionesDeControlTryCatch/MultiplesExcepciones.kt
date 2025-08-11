fun main() {
    print("Ingresa un número en texto: ")
    val texto = readLine()

    print("Ingresa un divisor: ")
    val divisorTexto = readLine()

    try {
        val numero = texto?.toInt() ?: throw NumberFormatException()
        val divisor = divisorTexto?.toInt() ?: throw NumberFormatException()

        val resultado = numero / divisor
        println("Resultado de la división: $resultado")

    } catch (e: Exception) {
        when (e) {
            is NumberFormatException -> println("Error: Uno de los valores no es un número válido.")
            is ArithmeticException -> println("Error: División por cero no permitida.")
            else -> println("Error desconocido: ${e.message}")
        }
    }
}
