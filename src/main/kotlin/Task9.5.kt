fun main() {
    val countryCode = "+7"
    val phoneLength = 10
    var phoneBook = mutableMapOf(
        "Vova" to "+79004003020",
        "Tanya" to "+79054001022",
        "Ted" to "+709004003020",
        "Dasha" to "+357005001020",
        "Nobody" to "",
        "Petya" to "+17005001020",
        "Marina" to "+127005001020",
    )

    println("phone book: $phoneBook\n")

    val countryCodeRange = IntRange(0, countryCode.length - 1)
    phoneBook = phoneBook.filterValues {
        (it.length == countryCode.length + phoneLength) &&
                (it.slice(countryCodeRange) == countryCode)
    }.toMutableMap()

    println("filtered phone book: $phoneBook")
}
