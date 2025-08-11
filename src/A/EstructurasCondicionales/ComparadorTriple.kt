fun main() {
    print("Ingresa el primer número: ")
    val num1 = readLine()?.toIntOrNull()

    print("Ingresa el segundo número: ")
    val num2 = readLine()?.toIntOrNull()

    print("Ingresa el tercer número: ")
    val num3 = readLine()?.toIntOrNull()

    if (num1 == null || num2 == null || num3 == null) {
        println("Por favor ingresa solo números válidos.")
        return
    }

    val mayor = maxOf(num1, num2, num3)
    val menor = minOf(num1, num2, num3)

    println("Mayor: $mayor")
    println("Menor: $menor")

    val repetidos = mutableSetOf<Int>()
    if (num1 == num2 || num1 == num3) repetidos.add(num1)
    if (num2 == num3) repetidos.add(num2)

    if (repetidos.isNotEmpty()) {
        println("Número(s) repetido(s): ${repetidos.joinToString(", ")}")
    } else {
        println("Todos los números son diferentes.")
    }
}
