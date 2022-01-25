fun main(args: Array<String>) {
    print("Enter positive integer: ")
    val line = readLine()
    if (line != null) {
        val firstDigit = line.first()
        val lastDigit = line.last()
        println("Fist and last digit sum is: ${firstDigit.digitToInt() + lastDigit.digitToInt()}")
    }
}