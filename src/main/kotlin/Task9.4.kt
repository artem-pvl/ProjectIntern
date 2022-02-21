fun main() {
    val arrayOfNumbers = IntRange(1, 7).toList()
    println(arrayOfNumbers.joinToString (separator = "+", prefix = "=", postfix = "=" ))
}
