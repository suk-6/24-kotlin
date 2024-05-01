import kotlin.reflect.typeOf

fun main() {
    val x = 10
    val y = 5

    println("x + y = ${calculate(x, y, Operation.ADD)}")
    println("x - y = ${calculate(x, y, Operation.SUBTRACT)}")
    println("x * y = ${calculate(x, y, Operation.MULTIPLY)}")
    println("x / y = ${calculate(x, y, Operation.DIVIDE)}")
}

fun calculate(x: Int, y: Int, operation: Operation): Number {
    return when (operation) {
        Operation.ADD -> x + y
        Operation.SUBTRACT -> x - y
        Operation.MULTIPLY -> x * y
        Operation.DIVIDE -> x / y
        else -> throw IllegalArgumentException("Invalid operation")
    }
}

enum class Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}