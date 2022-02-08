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
        val absArray = arrayOfNumbers.map { abs(it) }
        val min = absArray.minOrNull() ?: 0
        val max = absArray.maxOrNull() ?: 0
        val minIndexFirst = absArray.indexOfFirst { it == min }
        val minIndexLast = absArray.indexOfLast { it == min }
        val maxIndexFirst = absArray.indexOfFirst { it == max }
        val maxIndexLast = absArray.indexOfLast { it == max }

        val minDistance = Array(4) { 0 }
        minDistance[0] = abs(minIndexFirst - maxIndexFirst)
        minDistance[1] = abs(minIndexFirst - maxIndexLast)
        minDistance[2] = abs(minIndexLast - maxIndexFirst)
        minDistance[3] = abs(minIndexLast - maxIndexLast)

        var distanceIndex = 0
        var minValue = 0
        minDistance.forEachIndexed { index, elem ->
            if (elem < minValue) {
                minValue = elem
                distanceIndex = index
            }
        }

        var startIndex = 0
        var stopIndex = 0
        when (distanceIndex) {
            0 -> {
                startIndex = minIndexFirst
                stopIndex = maxIndexFirst
            }
            1 -> {
                startIndex = minIndexFirst
                stopIndex = maxIndexLast
            }
            2 -> {
                startIndex = minIndexLast
                stopIndex = maxIndexFirst
            }
            3 -> {
                startIndex = minIndexLast
                stopIndex = maxIndexLast
            }
        }
        if (startIndex > stopIndex) {
            val tmp = startIndex
            startIndex = stopIndex
            stopIndex = tmp
        }

        var mul = 1
        for (elem in startIndex..stopIndex) {
            mul *= arrayOfNumbers[elem]
        }
        return mul
    }

    fun getAverage(): Double {
        return arrayOfNumbers.average()
    }
}