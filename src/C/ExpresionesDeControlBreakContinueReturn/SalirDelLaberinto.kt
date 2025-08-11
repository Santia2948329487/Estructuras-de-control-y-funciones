fun main() {
    for (posicion in 1..10) {
        println("Avanzando a la posición $posicion...")

        if (posicion == 6) {
            println("¡Encontraste la salida en la posición $posicion!")
            break
        }
    }
}
