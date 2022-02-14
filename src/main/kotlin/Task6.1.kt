import kotlin.math.PI
import kotlin.math.sin
import kotlin.math.sqrt

fun main() {
    val figures = arrayOf(
        Square(10.0),
        Parallelogram(10.0, 5.0, 90.0),
        Circle(20.0),
        Triangle(4.0, 4.0, 4.0)
    )

    for (fig in figures) {
        println("In ${fig.name} area is: ${fig.area()}, and perimetr is: ${fig.perimetr()}")
    }
}

abstract class Figure {
    abstract val name: String

    abstract fun area(): Double
    abstract fun perimetr(): Double
}

class Square(var side: Double) : Figure() {
    override val name = "Square"

    override fun area(): Double {
        return side * side
    }

    override fun perimetr(): Double {
        return 4 * side
    }
}

class Parallelogram(var side1: Double, var side2: Double, var angle: Double) : Figure() {
    override val name = "Parallelogram"

    override fun area(): Double {
        return side1 * side2 * sin(angle * PI / 180)
    }

    override fun perimetr(): Double {
        return (side1 + side2) * 2
    }
}

class Circle(var radius: Double) : Figure() {
    override val name = "Circle"

    override fun area(): Double {
        return PI * sqr(radius)
    }

    override fun perimetr(): Double {
        return 2 * radius * PI
    }
}

class Triangle(var side1: Double, var side2: Double, var side3: Double) : Figure() {
    override val name = "Triangle"

    override fun area(): Double {
        val halfPerimetr = perimetr() / 2.0
        return sqrt(halfPerimetr * (halfPerimetr - side1) * (halfPerimetr - side2) * (halfPerimetr - side3))
    }

    override fun perimetr(): Double {
        return side1 + side2 + side3
    }
}
