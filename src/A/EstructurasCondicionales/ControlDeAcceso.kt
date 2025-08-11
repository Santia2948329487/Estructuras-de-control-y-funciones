fun main() {
    print("Ingresa tu edad: ")
    val edad = readLine()?.toIntOrNull()

    print("¿Tienes invitación especial? (sí/no): ")
    val tieneInvitacion = readLine()?.lowercase()

    if (edad == null) {
        println("Edad no válida.")
        return
    }

    val accesoPermitido = edad >= 18 || tieneInvitacion == "sí" || tieneInvitacion == "si"

    if (accesoPermitido) {
        println("Acceso permitido.")
    } else {
        println("Acceso denegado.")
    }
}
