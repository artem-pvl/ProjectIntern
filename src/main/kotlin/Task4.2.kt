fun main() {
    val arrayOfNumbers = Array(10) { _ -> (-20..20).random() }

    println("Random array of numbers:")
    arrayOfNumbers.forEach { i -> print("$i ") }
    println("")

    val myArray = NumbersArray(arrayOfNumbers)

    var result: Int? = myArray.sumOfElements
    println("Sum of elements is: $result")

    result = myArray.getMax()
    println("Max value in array: $result")

    result = myArray.getMin()
    println("Min value in array: $result")

    myArray.increase()

    println("Array of numbers after increasing:")
    arrayOfNumbers.forEach { i -> print("$i ") }
    println("")

    result = myArray.sumOfElements
    println("Sum of elements is: $result")

    result = myArray.getMax()
    println("Max value in array: $result")

    result = myArray.getMin()
    println("Min value in array: $result")
}

class NumbersArray(var arrayOfNumbers: Array<Int>) {
    val sumOfElements: Int
        get() = arrayOfNumbers.reduce{ sum, elem -> sum + elem }

    fun increase() {
        for ((i, elem) in arrayOfNumbers.withIndex()) {
            arrayOfNumbers[i] = if (elem % 2 == 0) elem*2 else elem*3
        }
    }

    fun getMax(): Int? {
        return arrayOfNumbers.maxOrNull()
    }

    fun getMin(): Int? {
        return arrayOfNumbers.minOrNull()
    }
}