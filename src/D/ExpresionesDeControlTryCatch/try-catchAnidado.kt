fun main() {
    print("Ingresa un número en texto: ")
    val entrada = readLine()

    try {
        val numero = try {
            entrada?.toInt() ?: throw NumberFormatException("Entrada vacía o nula.")
        } catch (e: NumberFormatException) {
            println("Error al convertir a número: ${e.message}")
            return
        }

        val resultado = try {
            100 / numero
        } catch (e: ArithmeticException) {
            println("Error al dividir: ${e.message}")
            return
        }

        println("Resultado de 100 dividido por $numero: $resultado")

    } catch (e: Exception) {
        println("Error inesperado: ${e.message}")
    }
}
