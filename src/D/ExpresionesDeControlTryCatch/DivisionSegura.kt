package D.ExpresionesDeControlTryCatch

fun main() {
    print("Ingresa el numerador: ")
    val numerador = readLine()?.toDoubleOrNull()

    print("Ingresa el denominador: ")
    val denominador = readLine()?.toDoubleOrNull()

    try {
        if (numerador == null || denominador == null) {
            throw IllegalArgumentException("Debes ingresar números válidos.")
        }

        val resultado = numerador / denominador
        println("Resultado: $resultado")
    } catch (e: ArithmeticException) {
        println("Error: División por cero no permitida.")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
