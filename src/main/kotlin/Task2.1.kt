/*
Вывести на экран n-ное число простых чисел начиная от 2.
Простое число - это натуральное (целое положительное) число, имеющее ровно два различных натуральных делителя — единицу
и самого себя.

Документация:
https://ru.wikipedia.org/wiki/%D0%A0%D0%B5%D1%88%D0%B5%D1%82%D0%BE_%D0%AD%D1%80%D0%B0%D1%82%D0%BE%D1%81%D1%84%D0%B5%D0%BD%D0%B0
https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D0%BE%D1%81%D1%82%D0%BE%D0%B5_%D1%87%D0%B8%D1%81%D0%BB%D0%BE
 */

fun main(args: Array<String>) {
    print("Enter the number of prime numbers: ")
    val line = readLine()

    if (line != null) {
        val numberOfPrimes = line.toInt()
        if (numberOfPrimes == 0) return

        var i = 0
        var j = 2
        while (i < numberOfPrimes) {
            while (!isPrime(j)) j++
            print("$j ")
            i++
            j++
        }
    }
}

fun isPrime(number: Int): Boolean {
    if (number < 2) return false
    val halfNumber: Int = number / 2
    for (i in 2..halfNumber) if (number % i == 0) return false
    return true
}