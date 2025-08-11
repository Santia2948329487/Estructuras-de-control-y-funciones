fun main() {
    print("Ingresa la extensión del archivo (sin punto): ")
    val extension = readLine()?.lowercase()

    val tipoArchivo = when (extension) {
        "jpg", "png", "gif", "bmp" -> "Imagen"
        "pdf" -> "Documento"
        "txt" -> "Texto plano"
        "doc", "docx" -> "Documento de Word"
        "xls", "xlsx" -> "Hoja de cálculo"
        "mp3", "wav" -> "Audio"
        "mp4", "avi" -> "Video"
        else -> "Tipo de archivo desconocido"
    }

    println("El archivo es de tipo: $tipoArchivo")
}
