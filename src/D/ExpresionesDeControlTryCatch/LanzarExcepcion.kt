fun validarEdad(edad: Int) {
    if (edad < 0) {
        throw IllegalArgumentException("La edad no puede ser negativa.")
    } else {
        println("Edad válida: $edad años")
    }
}

fun main() {
    print("Ingresa tu edad: ")
    val edadInput = readLine()?.toIntOrNull()

    try {
        if (edadInput == null) {
            throw NumberFormatException("No ingresaste un número válido.")
        }

        validarEdad(edadInput)
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
