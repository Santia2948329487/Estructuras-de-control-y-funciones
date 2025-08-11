fun main() {
    val letras = listOf('A', 'B', 'C', 'D', 'E')

    for ((indice, letra) in letras.withIndex()) {
        println("Índice $indice → Letra $letra")
    }
}
