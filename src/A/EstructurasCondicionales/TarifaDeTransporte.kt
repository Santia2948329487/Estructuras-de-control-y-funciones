fun main() {
    print("Ingresa tu edad: ")
    val edad = readLine()?.toIntOrNull()

    if (edad == null || edad < 0) {
        println("Por favor ingresa una edad válida.")
        return
    }

    val tarifa = when {
        edad < 12 -> "Tarifa infantil"
        edad in 12..64 -> "Tarifa general"
        else -> "Tarifa de adulto mayor"
    }

    println("Categoría: $tarifa")
}
