fun main() {
    val arrayOfNumbers = MutableList(10) { (-50..50).random() }
    println(arrayOfNumbers)
    arrayOfNumbers.forEachIndexed { index, i ->
        if (i > 0) arrayOfNumbers[index] = -i
    }
    println(arrayOfNumbers)
}
