fun main() {
    println("Первое число")
    val value1 = inputInt()
    println()
    println("Второе число")
    val value2 = inputInt()
    println()

    print("Введите знак операции [+, -, *, /]: ")
    var operationResult = 0.0
    var isnotSign = true
    var sign: String? = ""
    while (isnotSign) {
        sign = readLine()
        when (sign) {
            "+" -> {
                operationResult = value1 + value2
                isnotSign = false
            }
            "-" -> {
                operationResult = value1 - value2
                isnotSign = false
            }
            "*" -> {
                operationResult = value1 * value2
                isnotSign = false
            }
            "/" -> {
                operationResult = value1 / value2
                isnotSign = false
            }
            else -> println("Введите один из знаков операции: +, -, *, /")
        }
    }

    println("Результат операции $value1 $sign $value2 = $operationResult")
}

fun inputInt(): Double {
    while (true) {
        print("Число: ")
        val str = readLine()
        try {
            return str!!.toDouble()
        } catch (e: Exception) {
            println("Пожалуйста введите число")
        }
    }
}
