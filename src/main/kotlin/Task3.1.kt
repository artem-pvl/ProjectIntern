import kotlin.math.sqrt

fun main() {
    // a*x^2 + b*x + c = 0
    val a: Double = 1.0
    val b: Double = -2.0
    val c: Double = -3.0

    quadraticRoot(a, b, c)
}

fun sqr(n: Double): Double {
    return n * n
}

fun discriminant(a: Double, b: Double, c: Double): Double {
    return if (a == 0.0) -1.0 else sqr(b) - 4 * a * c
}

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val discr = discriminant(a, b, c)
    when {
        discr == 0.0 -> return 1
        discr > 0.0 -> return 2
        else -> return 0
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val numberOfRoots = rootsNumber(a, b, c)
    val discr = discriminant(a, b, c)

    when (numberOfRoots) {
        1 -> {
            val root = (-b + sqr(discr)) / (2 * a)
            println("Root is: $root")
        }
        2 -> {
            val root1 = (-b + sqrt(discr)) / (2 * a)
            val root2 = (-b - sqrt(discr)) / (2 * a)
            println("Root 1 is: $root1, root 2 is: $root2")
        }
        else -> {
            println("There is no roots!")
        }
    }
}
