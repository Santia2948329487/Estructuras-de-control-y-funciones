fun main() {
    filas@ for (i in 0..3) {
        for (j in 0..3) {
            if (i == j) {
                continue@filas // Salta a la siguiente iteración del bucle externo
            }
            println("i=$i, j=$j")
        }
    }
}
