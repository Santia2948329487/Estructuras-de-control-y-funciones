fun main() {
    var suma = 0

    for (i in 1..10) {
        if (i % 3 == 0) {
            continue // Saltar múltiplos de 3
        }
        suma += i
    }

    println("La suma del 1 al 10 excluyendo múltiplos de 3 es: $suma")
}
