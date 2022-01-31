fun main() {
    val arrayOfNumbers = Array(10) { _ -> (-50..50).random() }

    println("Random string:")
    arrayOfNumbers.forEach { i -> print("$i ") }
    println("")
    println("")

    println("Result by filterByFor function:")
    filterByFor(arrayOfNumbers)
    println("")

    println("Result by filterByWhile function:")
    filterByWhile(arrayOfNumbers)
    println("")

    println("Result by filterByForEach function:")
    filterByForEach(arrayOfNumbers)
}

fun filterByFor(arr: Array<Int>) {
    for ((index, value) in arr.withIndex()) {
        val prevValue = getPrevValue(arr, index)
        val nextValue = getNextValue(arr, index)
        if (value > prevValue && value > nextValue) print("$value ")
    }
    println()
}

fun filterByWhile(arr: Array<Int>) {
    var index = 0
    while (index < arr.size) {
        val value = arr[index]
        val prevValue = getPrevValue(arr, index)
        val nextValue = getNextValue(arr, index)
        if (value > prevValue && value > nextValue) print("$value ")
        index++
    }
    println()
}

fun filterByForEach(arr: Array<Int>) {
    arr.forEachIndexed { index, value ->
        print(
            if (value > getPrevValue(arr, index)
                && value > getNextValue(arr, index)
            ) "$value " else ""
        )
    }
    println()
}

fun getPrevValue(arr: Array<Int>, currentIndex: Int): Int {
    return if (currentIndex - 1 < 0) arr[currentIndex] - 1 else arr[currentIndex - 1]
}

fun getNextValue(arr: Array<Int>, currentIndex: Int): Int {
    return if (currentIndex + 1 >= arr.size) arr[currentIndex] - 1 else arr[currentIndex + 1]
}
