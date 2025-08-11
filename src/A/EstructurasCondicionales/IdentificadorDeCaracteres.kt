fun main() {
    print("Ingresa un carácter: ")
    val input = readLine()

    if (input.isNullOrEmpty() || input.length != 1) {
        println("Por favor ingresa un solo carácter.")
        return
    }

    val char = input[0]

    val tipo = when {
        char.isDigit() -> "Número"
        char.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u') -> "Vocal"
        char.isLetter() -> "Consonante"
        else -> "Símbolo especial"
    }

    println("El carácter '$char' es: $tipo")
}
