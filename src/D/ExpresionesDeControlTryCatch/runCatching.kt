fun main() {
    print("Ingresa un número: ")
    val entrada = readLine() ?: ""

    val resultado = runCatching { entrada.toInt() }

    resultado
        .onSuccess { println("Número convertido correctamente: $it") }
        .onFailure { println("Error al convertir: ${it.message}") }
}
