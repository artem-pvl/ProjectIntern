fun main() {
    val turtlePoint = Point(0, 0)

    val commands = Command.values()
    for (i in 1..15) {
        val someCommand = (0..3).random()
        println(turtlePoint.toString())
        Turtle().move(turtlePoint, commands[someCommand])
        println(turtlePoint.toString())
        println("")
    }
}

class Point(var x: Int, var y: Int) {
    override fun toString(): String {
        return "текущие координаты $x, $y"
    }
}

enum class Command { UP, DOWN, LEFT, RIGHT }

class Turtle() {
    fun move(point: Point, command: Command) {
        var x = 0
        var y = 0
        when (command) {
            Command.UP -> y = 1
            Command.DOWN -> y = -1
            Command.LEFT -> x = -1
            Command.RIGHT -> x = 1
        }
        point.y += y
        point.x += x
        println("Произведено перемещение $command по оси X на $x, по оси Y на $y")
    }
}
