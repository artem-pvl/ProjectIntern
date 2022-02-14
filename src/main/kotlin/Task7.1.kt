fun main() {
    var car1 = Car("Lada", 100)
    var car2 = Car("Lada", 100)

    println("car1 == car2: ${car1 == car2}")
    println("car1 === car2: ${car1 === car2}")
    println("car1 hash: ${car1.hashCode()}")
    println("car2 hash: ${car2.hashCode()}")

    var car3 = car1
    println("car1 == car3: ${car1 == car3}")
    println("car1 === car3: ${car1 === car3}")
    println("car1 hash: ${car1.hashCode()}")
    println("car2 hash: ${car3.hashCode()}")
    car3.name = "Belaz"
    println("car1.name: ${car1.name}")
    println("car3.name: ${car3.name}")

    var vehicle1 = Vehicle7("Ural", 100)
    var vehicle2 = Vehicle7("Ural", 100)

    println("vehicle1 == vehicle2: ${vehicle1 == vehicle2}")
    println("vehicle1 === vehicle2: ${vehicle1 === vehicle2}")
    println("vehicle1 hash: ${vehicle1.hashCode()}")
    println("vehicle2 hash: ${vehicle2.hashCode()}")

    var vehicle3 = vehicle1.copy("ZIL")
    println("vehicle1 == vehicle3: ${vehicle1 == vehicle3}")
    println("vehicle1 === vehicle3: ${vehicle1 === vehicle3}")
    println("vehicle1 hash: ${vehicle1.hashCode()}")
    println("vehicle3 hash: ${vehicle3.hashCode()}")
    var vehicle4 = vehicle1.copy()
    println("vehicle1 == vehicle4: ${vehicle1 == vehicle4}")
    println("vehicle1 === vehicle4: ${vehicle1 === vehicle4}")
    println("vehicle1 hash: ${vehicle1.hashCode()}")
    println("vehicle4 hash: ${vehicle4.hashCode()}")
}

class Car(var name: String, var speed: Int)

data class Vehicle7(val name: String, val speed: Int)
