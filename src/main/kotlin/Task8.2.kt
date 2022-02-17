fun main() {
    val wordsList = listOf("list", "of", null, "for", "the", "list", null)

    for (word in wordsList) {
        println("element '$word'")

        if (word != null) println("for if it's ${word.uppercase()}")

        println("for ? it's ${word?.uppercase()}")

        word?.let { println("for let it's ${word.uppercase()}") }

        val str = word ?: "empty"
        println("for ?: it's ${str.uppercase()}")

        println()
    }
}