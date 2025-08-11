fun main() {
    print("Ingresa una contraseña: ")
    val password = readLine() ?: ""

    val mensaje = when {
        password.length < 6 -> "Muy débil"
        password.length in 6..8 -> "Débil"
        else -> "Fuerte"
    }

    println("Fortaleza: $mensaje")
}
