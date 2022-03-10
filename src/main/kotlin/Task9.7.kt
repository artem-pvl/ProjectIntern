import kotlin.math.pow

fun main() {
    var inputString: String?
    var splitString: List<String>
    var seconds = 0

    var incorrectInput = true
    while (incorrectInput) {
        print("Введите время в формате [ЧЧ:ММ:СС]: ")
        inputString = readLine()
        try {
            splitString = inputString!!.split(":")
            if (splitString.size != 3) throw Exception()

            for ((index, value) in splitString.withIndex()) {
                val intValue = value.toInt()
                when (index) {
                    0 -> if (intValue !in 0..24) throw Exception()
                    1, 2 -> if (intValue !in 0..59) throw Exception()
                }

                seconds += 60.0.pow(2 - index).toInt() * intValue
            }

            incorrectInput = false
        } catch (e: Exception) {
            println("Пожалуйста введите время в формате [ЧЧ:ММ:СС]")
        }
    }
    println("Количество секунд: $seconds")
}