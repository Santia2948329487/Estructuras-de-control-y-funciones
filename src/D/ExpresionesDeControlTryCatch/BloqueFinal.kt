fun main() {
    print("Ingresa el numerador: ")
    val a = readLine()?.toDoubleOrNull()

    print("Ingresa el denominador: ")
    val b = readLine()?.toDoubleOrNull()

    try {
        if (a == null || b == null) {
            throw IllegalArgumentException("Entrada inválida.")
        }

        val resultado = a / b
        println("Resultado de la división: $resultado")
    } catch (e: ArithmeticException) {
        println("Error: División por cero.")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    } finally {
        println("Operación finalizada.")
    }
}
