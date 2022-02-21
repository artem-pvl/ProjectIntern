fun main() {
    val listOfNumbers = List(10) { (-50..50).random() }
    println(listOfNumbers)
    val sqrList = listOfNumbers.map { it*it }
    println(sqrList)
}