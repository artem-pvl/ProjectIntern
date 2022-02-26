fun main() {
    val message = "!ADWS 1adws r"
    val ufo = Ufo(x = 0, y = 0)

    val moveLeft = { it: Int -> ufo.move(Command1.Left(it)) }
    val moveRight = { it: Int -> ufo.move(Command1.Right(it)) }
    val moveUp = { it: Int -> ufo.move(Command1.Up(it)) }
    val moveDown = { it: Int -> ufo.move(Command1.Down(it)) }
    messageParse(
        encryptedMessage = message,
        eventUp = moveUp,
        eventDown = moveDown,
        eventLeft = moveLeft,
        eventRight = moveRight
    )
}

sealed class Command1 {
    data class Up(val step: Int) : Command1()
    data class Down(val step: Int) : Command1()
    data class Right(val step: Int) : Command1()
    data class Left(val step: Int) : Command1()
}

class Ufo(var x: Int, var y: Int) {
    override fun toString(): String {
        println("Ufo is here now X: $x, Y: $y")
        return super.toString()
    }

    fun move(command: Command1) {
        when (command) {
            is Command1.Up -> {
                y += command.step
                println("Rick's ufo shifted to the up by ${command.step}")
            }
            is Command1.Down -> {
                y -= command.step
                println("Rick's ufo shifted to the down by ${command.step}")
            }
            is Command1.Left -> {
                x -= command.step
                println("Rick's ufo shifted to the left by ${command.step}")
            }
            is Command1.Right -> {
                x += command.step
                println("Rick's ufo shifted to the right by ${command.step}")
            }
        }
    }
}

fun messageParse(
    encryptedMessage: String,
    eventUp: (Int) -> Unit,
    eventDown: (Int) -> Unit,
    eventLeft: (Int) -> Unit,
    eventRight: (Int) -> Unit
) {
    for (char in encryptedMessage) {
        when (char) {
            'a' -> eventLeft(1)
            'A' -> eventLeft(2)
            'd' -> eventRight(1)
            'D' -> eventRight(2)
            'w' -> eventUp(1)
            'W' -> eventUp(2)
            's' -> eventDown(1)
            'S' -> eventDown(2)
        }
    }
}
