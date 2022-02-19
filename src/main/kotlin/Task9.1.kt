fun main() {
    val listOfNumbers = List(10) { _ -> (-50..50).random() }
    println(listOfNumbers)
    val negativeNumbersList = listOfNumbers.filter { it < 0 }
    println(negativeNumbersList)
}
