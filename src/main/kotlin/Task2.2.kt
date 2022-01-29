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
        val prevValue = if (index - 1 < 0) value - 1 else arr[index - 1]
        val nextValue = if (index + 1 >= arr.size) value - 1 else arr[index + 1]
        if (value > prevValue && value > nextValue) print("$value ")
    }
    println()
}

fun filterByWhile(arr: Array<Int>) {
    var index = 0
    while (index < arr.size) {
        val value = arr[index]
        val prevValue = if (index - 1 < 0) value - 1 else arr[index - 1]
        val nextValue = if (index + 1 >= arr.size) value - 1 else arr[index + 1]
        if (value > prevValue && value > nextValue) print("$value ")
        index++
    }
    println()
}

fun filterByForEach(arr: Array<Int>) {
    arr.forEachIndexed { index, value ->
        print(
            if (value > (if (index - 1 < 0) value - 1 else arr[index - 1])
                && value > (if (index + 1 >= arr.size) value - 1 else arr[index + 1])
            ) value.toString() + " " else ""
        )
    }
    println()
}
