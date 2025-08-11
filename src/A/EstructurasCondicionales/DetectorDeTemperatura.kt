fun main() {
    print("Ingresa la temperatura en grados Celsius: ")
    val temperatura = readLine()?.toDoubleOrNull()

    if (temperatura == null) {
        println("Por favor ingresa un número válido.")
        return
    }

    val estado = when {
        temperatura < 0 -> "Bajo cero"
        temperatura in 0.0..14.9 -> "Fría"
        temperatura in 15.0..25.0 -> "Agradable"
        else -> "Calurosa"
    }

    println("La temperatura está: $estado")
}
