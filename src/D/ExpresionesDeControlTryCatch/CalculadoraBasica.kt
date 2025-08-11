fun main() {
    print("Ingresa el primer número: ")
    val num1 = readLine()?.toDoubleOrNull()

    print("Ingresa el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull()

    print("Ingresa una operación (+, -, *, /): ")
    val operador = readLine()

    try {
        if (num1 == null || num2 == null) {
            throw IllegalArgumentException("Debes ingresar números válidos.")
        }

        val resultado = when (operador) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            else -> throw UnsupportedOperationException("Operación no válida.")
        }

        println("Resultado: $resultado")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
