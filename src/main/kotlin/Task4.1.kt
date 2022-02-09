import kotlin.math.abs

fun main() {
    val arrayOfNumbers = Array(10) { _ -> (-20..20).random() }
//    val arrayOfNumbers = arrayOf(-9, 2, 8, 4, 1, 3, 6, 8, 2, 5, -9)

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
        var minAbsValue = abs(arrayOfNumbers.first())
        var maxAbsValue = abs(arrayOfNumbers.first())
        arrayOfNumbers.forEach { elem ->
            if (minAbsValue > abs(elem)) minAbsValue = abs(elem)
            if (maxAbsValue < abs(elem)) maxAbsValue = abs(elem)
        }
//        println("Min: $minAbsValue max: $maxAbsValue")
        var minDistance = arrayOfNumbers.size
        var startIndex = 0
        var stopIndex = arrayOfNumbers.size
        for ((index, value) in arrayOfNumbers.withIndex()) {
            if (abs(value) == minAbsValue) {
                var findNext = true
                var i = index + 1
                while (findNext && (i < arrayOfNumbers.size)) {
                    if (abs(arrayOfNumbers[i]) == maxAbsValue) {
                        val distance = abs(index - i)
                        if (minDistance > distance) {
                            minDistance = distance
                            startIndex = index
                            stopIndex = i
//                            println("Start: $startIndex stop: $stopIndex dist: $minDistance")
                        }
                        findNext = false
                    }
                    i++
                }
            }
            if (abs(value) == maxAbsValue) {
                var findNext = true
                var i = index + 1
                while (findNext && (i < arrayOfNumbers.size)) {
                    if (abs(arrayOfNumbers[i]) == minAbsValue) {
                        val distance = abs(index - i)
                        if (minDistance > distance) {
                            minDistance = distance
                            startIndex = index
                            stopIndex = i
//                            println("Start: $startIndex stop: $stopIndex dist: $minDistance")
                        }
                        findNext = false
                    }
                    i++
                }
            }
        }
//        println("final Start: $startIndex stop: $stopIndex dist: $minDistance")
        if (minDistance <= 1) return 0

        var mul = 1
        for (elem in startIndex + 1 until stopIndex) {
            mul *= arrayOfNumbers[elem]
        }
        return mul
    }

    fun getAverage(): Double {
        return arrayOfNumbers.average()
    }
}