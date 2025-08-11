fun main() {
    print("Ingresa la nota (0 - 100): ")
    val nota = readLine()?.toIntOrNull()

    if (nota == null || nota !in 0..100) {
        println("Por favor ingresa un número válido entre 0 y 100.")
        return
    }

    val resultado = when {
        nota >= 90 -> "Excelente"
        nota in 70..89 -> "Bueno"
        nota in 50..69 -> "Regular"
        else -> "Reprobado"
    }

    println("Clasificación: $resultado")
}
