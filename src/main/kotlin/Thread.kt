fun main() {
    println("Начало main")
    Thread{
        imitationTwo()
    }.start()
    Thread{
        imitationOne()
    }.start()
    println("Конец main")
}

fun imitationOne() {
    for(i in 1..10) {
        Thread.sleep(1500)
        println("One: $i")
    }
}

fun imitationTwo() {
    for(i in 1..10) {
        Thread.sleep(1000)
        println("Two: $i")
    }
}
