fun main() {
    print("Ingresa el rol del usuario (admin, moderador, usuario, invitado): ")
    val rol = readLine()?.lowercase()

    val permisos = when (rol) {
        "admin" -> "Acceso total al sistema"
        "moderador" -> "Acceso para moderar contenido y usuarios"
        "usuario" -> "Acceso limitado a funcionalidades básicas"
        "invitado" -> "Acceso solo para visualizar contenido público"
        else -> "Rol desconocido o no autorizado"
    }

    println("Permisos asignados: $permisos")
}
