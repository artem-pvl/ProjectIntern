fun main() {
    val mListOfNumbers = MutableList(10) { (-50..50).random() }
    println(mListOfNumbers)
    mListOfNumbers.forEachIndexed { index, i ->
        if (i > 0) mListOfNumbers[index] = -i
    }
    println(mListOfNumbers)
}
