
package task1

/**
 * Считает количество вхождений символа [symbol] (без учёта регистра)
 * в строке [text] и формирует человеко‑читаемое сообщение.
 */
fun countCharOccurrences(text: String, symbol: Char): String {
    val occurrences = text.count { it.equals(symbol, ignoreCase = true) }
    return if (occurrences > 0) {
        "Количество символов '$symbol' в строке \"$text\" == $occurrences"
    } else {
        "Символ '$symbol' в строке \"$text\" не найден"
    }
}

fun main() {
    println(countCharOccurrences("Молоко", 'o'))
    println(countCharOccurrences("Молоко", 'a'))
}
