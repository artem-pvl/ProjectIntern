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
        if (numberOfPrimes == 1) {
            println("1: 2")
            return
        } else {
            println("1: 2")
            println("2: 3")
        }

        var i = 2
        var j = 5
        while (i < numberOfPrimes) {
            while (!isPrime(j)) j += 2
            println("${i+1}: $j")
            i++
            j += 2
        }
    }
}

fun isPrime(number: Int): Boolean {
    if (number < 2 || (number % 2 == 0)) return false

    var numbersArray = arrayOf<Int>()
    for (i in 3..number+1 step 2) {
        numbersArray += i
    }
    var currentPrime = numbersArray[0]
    while (currentPrime*currentPrime <= number) {
        numbersArray = numbersArray.filterNot { value -> value % currentPrime == 0 }.toTypedArray()
        if (numbersArray.isEmpty()) return false
        currentPrime = numbersArray[0]
    }
    return numbersArray.last() == number
}
