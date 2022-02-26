fun main() {
    val fahrenheit = {celsius: Int -> celsius * 9.0 / 5.0 + 32 }
    val celsius = 25
    println("$celsius degrees Celsius is ${fahrenheit(celsius)} degrees Fahrenheit")
}