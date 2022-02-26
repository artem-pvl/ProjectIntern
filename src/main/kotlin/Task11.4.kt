fun main() {
    val message = "abxbbznmfkYyyxX"

    val lambdaX = { println("обнаружен символ x") }
    val lambdaY = { println("обнаружен символ y") }
    val lambdaZ = { println("обнаружен символ z") }

    messageParse(message = message, eventX = lambdaX, eventY = lambdaY, eventZ = lambdaZ)
}

fun messageParse(message: String, eventX: () -> Unit, eventY: () -> Unit, eventZ: () -> Unit) {
    for (char in message.lowercase()) {
        when (char) {
            'x' -> eventX()
            'y' -> eventY()
            'z' -> eventZ()
        }
    }
}
