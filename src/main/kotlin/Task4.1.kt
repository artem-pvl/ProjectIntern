import kotlin.math.abs

fun main() {
    val arrayOfNumbers = Array(10) { _ -> (-20..20).random() }

    println("Random string:")
    arrayOfNumbers.forEach { i -> print("$i ") }
    println("")
    println("")

    val myNumbersArray = NumArray(arrayOfNumbers)

    var result = myNumbersArray.getSumOfPositives()
    println("Sum of positive elements is: $result")

    result = myNumbersArray.getMulOfRange()
    println("Mul of elements between abs(min) and abs(max) is: $result")

    val doubleResult = myNumbersArray.getAverage()
    println("Average of elements is: $doubleResult")
}

class NumArray(val arrayOfNumbers: Array<Int>) {
    fun getSumOfPositives(): Int {
        var sum = 0
        arrayOfNumbers.forEach { elem ->
            if (elem > 0) sum += elem
        }
        return sum
    }

    fun getMulOfRange(): Int {
        var minIndex = 0
        var maxIndex = arrayOfNumbers.lastIndex
        var minValue = arrayOfNumbers.first()
        var maxValue = arrayOfNumbers.last()
        arrayOfNumbers.forEachIndexed { index, elem ->
            if (abs(elem) < minValue) {
                minValue = abs(elem)
                minIndex = index
            }
            if (abs(elem) > maxValue) {
                maxValue = abs(elem)
                maxIndex = index
            }
        }

        var mul = 1
        for (elem in minIndex..maxIndex) {
            mul *= arrayOfNumbers[elem]
        }

        return mul
    }

    fun getAverage(): Double {
        return arrayOfNumbers.reduce{ sum, elem -> sum + elem }.toDouble() / arrayOfNumbers.size
    }
}