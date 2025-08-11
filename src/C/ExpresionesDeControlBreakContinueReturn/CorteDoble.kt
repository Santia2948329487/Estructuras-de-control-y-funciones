fun main() {
    externo@ for (i in 0..5) {
        for (j in 0..5) {
            println("i=$i, j=$j")

            if (i + j == 5) {
                println("Suma de índices es 5, saliendo de ambos bucles.")
                break@externo
            }
        }
    }
}
