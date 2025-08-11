fun main() {
    val pinCorrecto = "1234"
    var intentos = 0
    var ingreso: String?

    do {
        print("Ingresa el PIN: ")
        ingreso = readLine()
        intentos++

        if (ingreso == pinCorrecto) {
            println("✅ PIN correcto. Acceso concedido.")
            break
        } else {
            println("❌ PIN incorrecto. Intento $intentos de 3.")
        }

    } while (intentos < 3)

    if (ingreso != pinCorrecto) {
        println("🚫 Acceso bloqueado. Excediste los intentos.")
    }
}
