// Пользователь вводит с клавиатуры любые числа, до тех пор пока не будет введено число “0”.
// После ввода нуля необходимо вывести на экран количество введенных чисел, их общую сумму и среднее арифметическое.
// Использовать ввод с клавиатуры readLine().

fun main(args: Array<String>) {
    var inputString: String? = null
    var sum: Double = 0.0
    var count = 0

    while (inputString != "0") {
        print("Enter a some number: ")
        inputString = readLine()
        if (inputString != null && inputString != "0") {
            val inputNumber = inputString.toDouble()
            sum += inputNumber
            count++
        }
    }
    if (count != 0) {
        println("Amount of entered numbers is: $count")
        println("Their sum is: $sum")
        println("Their averega is: ${sum / count}")
    }
}