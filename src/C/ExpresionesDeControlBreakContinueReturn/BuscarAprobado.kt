fun hayAprobado(calificaciones: List<Int>): Boolean {
    for (nota in calificaciones) {
        if (nota > 60) {
            return true
        }
    }
    return false
}

fun main() {
    val notas = listOf(45, 58, 61, 30)
    if (hayAprobado(notas)) {
        println("Hay al menos un estudiante aprobado.")
    } else {
        println("Ningún estudiante aprobó.")
    }
}
