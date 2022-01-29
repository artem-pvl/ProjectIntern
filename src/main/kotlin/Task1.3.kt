// Программа “Угадай число”. Отгадать целое число которое “загадал” компьютер. Программа генерирует рандомное число A
// (используем (0..10).random()), пользователь вводит свой вариант-число B. Если число В>A выводим сообщение “Много”
// и повторяем ввод, если В<А выводим сообщение “Мало”и повторяем ввод, иначе “Угадал”.
// Примеры и документация:
// https://stackoverflow.com/questions/45685026/how-can-i-get-a-random-number-in-kotlin

fun main(args: Array<String>) {
    val A = (0..10).random()

    while (true) {
        print("Enter a number 0 to 10 to guess: ")
        val line = readLine()
        if (line != null) {
            val B = line.toInt()
            if (A == B) {
                println("Guessed!")
                return
            } else if (B > A) println("Too big") else println("Too small")
        }
    }
}