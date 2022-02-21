fun main() {
    var inputString: String?
    var enteredNumber = 0

    var incorrectInput = true
    while (incorrectInput) {
        print("Введите целое число от 0 до 100: ")
        inputString = readLine()
        try {
            enteredNumber = inputString!!.toInt()
            if (enteredNumber !in 0..100) throw Exception()
            incorrectInput = false
        } catch (e: Exception) {
            println("Пожалуйста введите число от 0 до 100")
        }
    }

    val numberWords = mapOf(
        0 to "ноль",
        1 to "один",
        2 to "два",
        3 to "три",
        4 to "четыре",
        5 to "пять",
        6 to "шесть",
        7 to "семь",
        8 to "восемь",
        9 to "девять",
        10 to "десять",
        11 to "одинадцать",
        12 to "двенадцать",
        13 to "тринадцать",
        14 to "четырнадцать",
        15 to "пятнадцать",
        16 to "шестнадцать",
        17 to "семнадцать",
        18 to "восемнадцать",
        19 to "девятнадцать",
        20 to "двадцать",
        30 to "тридцать",
        40 to "сорок",
        50 to "пятьдесят",
        60 to "шестьесят",
        70 to "семьдесят",
        80 to "восемьдесят",
        90 to "девяносто",
        100 to "сто",
    )

    if (numberWords.containsKey(enteredNumber)) {
        println("${numberWords[enteredNumber]}")
    } else {
        val firstOrder = enteredNumber % 10
        val secondOrder = enteredNumber / 10 * 10
        println("${numberWords[secondOrder]} ${numberWords[firstOrder]}")
    }
}
