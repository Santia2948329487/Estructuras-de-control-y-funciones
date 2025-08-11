fun main() {
    print("Ingresa un número del 1 al 7: ")
    val numero = readLine()?.toIntOrNull()

    val dia = when (numero) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Número inválido. Debe ser del 1 al 7."
    }

    println("Día de la semana: $dia")
}
