fun main() {
    var suma = 0

    for (i in 1..20) {
        if (i % 2 == 0) {
            suma += i
        }
    }

    println("La suma de los números pares del 1 al 20 es: $suma")
}
