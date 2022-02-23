fun main() {
    val countryCode = "+7"
    var phoneBook = mutableMapOf(
        "Vova" to "+79004003020",
        "Tanya" to "+79054001022",
        "Ted" to "+70900400302",
        "Dasha" to "+357005001020",
        "Nobody" to "",
        "Petya" to "+17005001020",
        "Marina" to "+127005001020",
    )

    println("phone book: $phoneBook")
    println("country code: $countryCode\n")

    val countryCodeRange = IntRange(0, countryCode.length - 1)
    phoneBook = phoneBook.filterValues { it ->
        (it.length >= countryCode.length) && (it.slice(countryCodeRange) == countryCode)
    }.toMutableMap()

    println("filtered phone book: $phoneBook")
}
