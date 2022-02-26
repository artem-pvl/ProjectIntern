fun main() {
    val concat = { str1: String, str2: String, str3: String ->
        val mListElements = mutableListOf(str1, str2, str3)
        mListElements.sortBy{ it.length }
        println(mListElements.joinToString(separator=""))
    }

    concat("1245", "a", "}{")
}