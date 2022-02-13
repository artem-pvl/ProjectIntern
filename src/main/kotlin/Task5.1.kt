fun main() {
    val vehicles = arrayOf(Vehicle(), Boat(), Airplane(), Tank())

    for (veh in vehicles) {
        veh.start()
        veh.stop()
    }
}

open class Vehicle() {
    open var speed: Double = 0.0
    open var name: String = "Vehicle"

    open fun start() {
        println("Vehicle started moving at a speed of $speed km/h")
    }

    open fun stop() {
        println("Vehicle stopped")
    }
}

class Boat(): Vehicle() {
    override var speed: Double = 15.0
    override var name: String = "Boat"

    override fun start() {
        println("Boat started moving at a speed of $speed km/h")
    }

    override fun stop() {
        println("Boat stopped")
    }
}

class Airplane(): Vehicle() {
    override var speed: Double = 650.0
    override var name: String = "Airplane"

    override fun start() {
        println("Airplane started moving at a speed of $speed km/h")
    }

    override fun stop() {
        println("Airplane stopped")
    }
}

class Tank(): Vehicle() {
    override var speed: Double = 85.0
    override var name: String = "Tank"

    override fun start() {
        println("Tank started moving at a speed of $speed km/h")
    }

    override fun stop() {
        println("Tank stopped")
    }
}
