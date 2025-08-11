fun calcularPrecioTotal(
    precioBase: Double,
    impuesto: Double = 21.0,
    descuento: Double = 0.0
): Double {
    // 1. Aplicar descuento
    val precioConDescuento = precioBase - (precioBase * (descuento / 100))

    // 2. Aplicar impuesto
    val precioFinal = precioConDescuento + (precioConDescuento * (impuesto / 100))

    return precioFinal
}

fun main() {
    // Llamada solo con precioBase
    println("Total 1: ${calcularPrecioTotal(100.0)}")

    // Llamada con precioBase y descuento usando argumento nombrado
    println("Total 2: ${calcularPrecioTotal(100.0, descuento = 10.0)}")

    // Llamada con precioBase e impuesto usando argumento nombrado
    println("Total 3: ${calcularPrecioTotal(100.0, impuesto = 15.0)}")

    // Llamada con todos los parámetros y cambio de orden
    println("Total 4: ${calcularPrecioTotal(descuento = 5.0, impuesto = 10.0, precioBase = 200.0)}")
}
