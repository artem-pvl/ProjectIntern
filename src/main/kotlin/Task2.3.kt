fun main() {
    val arrayOfNumbers = Array(10) { _ -> (1..20).random() }

    println("Random string:")
    arrayOfNumbers.forEach { i -> print("$i ") }
    println(arrayOfNumbers.forEach { i -> i+1 })
    println("")
    println("")

    var result = getMulAndExtremesByFor(arrayOfNumbers)
    println("Results by getMulAndExtremesByFor: mul is ${result[0]}, min is ${result[1]}, max is ${result[2]}")

    result = getMulAndExtremesByWhile(arrayOfNumbers)
    println("Results by getMulAndExtremesByWhile: mul is ${result[0]}, min is ${result[1]}, max is ${result[2]}")

    result = getMulAndExtremesByReduce(arrayOfNumbers)
    println("Results by getMulAndExtremesByReduce: mul is ${result[0]}, min is ${result[1]}, max is ${result[2]}")

    result = getMulAndExtremesByForEach(arrayOfNumbers)
    println("Results by getMulAndExtremesByForEach: mul is ${result[0]}, min is ${result[1]}, max is ${result[2]}")

    println("Results by min and max: min is ${arrayOfNumbers.minOrNull()}, max is ${arrayOfNumbers.maxOrNull()}")
}

fun getMulAndExtremesByFor(arr: Array<Int>): Array<Int> {
    var mul = 1
    var max = arr.first()
    var min = arr.first()

    for (value in arr){
        mul *= value
        if (max < value) max = value
        if (min > value) min = value
    }

    return arrayOf(mul, min, max)
}

fun getMulAndExtremesByWhile(arr: Array<Int>): Array<Int> {
    var mul = 1
    var max = arr.first()
    var min = arr.first()

    var i = 0
    while (i < arr.size) {
        mul *= arr[i]
        if (max < arr[i]) max = arr[i]
        if (min > arr[i]) min = arr[i]
        i++
    }

    return arrayOf(mul, min, max)
}

fun getMulAndExtremesByReduce(arr: Array<Int>): Array<Int> {
    val mul = arr.reduce{ innerMul, elem -> innerMul * elem }
    val max = arr.reduce{ innerMul, elem -> if (innerMul < elem) elem else innerMul }
    val min = arr.reduce{ innerMul, elem -> if (innerMul > elem) elem else innerMul }

    return arrayOf(mul, min, max)
}

fun getMulAndExtremesByForEach(arr: Array<Int>): Array<Int> {
    var mul = 1
    arr.forEach{ elem -> mul *= elem }
    var max = 0
    arr.forEach{ elem -> max = if (max < elem) elem else max }
    var min = max
    arr.forEach{ elem -> min = if (min > elem) elem else min }

    return arrayOf(mul, min, max)
}
