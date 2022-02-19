fun main() {
    val arrayOfNumbers = List(10) { (-50..50).random() }
    println(arrayOfNumbers)
    val sqrList = arrayOfNumbers.map { it*it }
    println(sqrList)
}