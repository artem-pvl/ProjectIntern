import kotlin.math.sqrt

fun main() {
    val v1 = Vector(1.0, 1.0, 1.0)
    val v2 = Vector(2.0, 2.0, 2.0)
    println("Length of v1 is: ${v1.length()}")
    println("Length of v2 is: ${v2.length()}")
    println("Scalar product of v1 and v2 with the infix is: ${v1 scalar v2}")
    println("Scalar product of vectors with the '*' operator is: ${ Vector(3.0, 3.0, 3.0) * Vector(5.0, 5.0, 5.0) }")
    println("Scalar product of vectors with the function is: ${ scalarProduct(v2, Vector(4.0, 4.0, 4.0)) }")
}

class Vector(var x: Double, var y: Double, var z: Double) {
    fun length(): Double = sqrt(x * x + y * y + z * z)
    infix fun scalar(vector: Vector) = x * vector.x + y * vector.y + z * vector.z
    operator fun times(vector: Vector) = this scalar vector
}

fun scalarProduct(vector1: Vector, vector2: Vector): Double = vector1 * vector2
