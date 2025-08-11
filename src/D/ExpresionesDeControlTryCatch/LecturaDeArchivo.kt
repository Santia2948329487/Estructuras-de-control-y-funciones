import java.io.File
import java.io.FileNotFoundException

fun main() {
    print("Ingresa el nombre del archivo a leer: ")
    val nombreArchivo = readLine()

    try {
        val archivo = File(nombreArchivo)
        val contenido = archivo.readText()
        println("Contenido del archivo:\n$contenido")
    } catch (e: FileNotFoundException) {
        println("Error: El archivo '$nombreArchivo' no existe.")
    }
}
