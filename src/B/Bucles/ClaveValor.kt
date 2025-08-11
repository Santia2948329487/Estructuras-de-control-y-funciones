import kotlin.collections.iterator

fun main() {
    val estudiantes = mapOf(
        "Ana" to 85,
        "Luis" to 45,
        "María" to 72,
        "Carlos" to 38,
        "Lucía" to 90
    )

    for ((nombre, nota) in estudiantes) {
        val estado = if (nota >= 60) "Aprobado" else "Reprobado"
        println("$nombre: $nota → $estado")
    }
}
