
package task2

import common.FOUNDATION_DATE
import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
 * Анализирует объект [value] и возвращает описание согласно заданию.
 */
fun analyse(value: Any?): String = when (value) {
    null -> "Объект равен null"

    is String -> "Я получил тип String = '$value', её длина равна ${value.length} ${plural(value.length)}"

    is Int -> {
        val digits = value.toString().toCharArray().joinToString(", ")
        "Я получил Int = $value, я состою из цифр $digits"
    }

    is Double -> {
        val rounded = "%.2f".format(value).replace(',', '.')
        "Я получил Double = $value, это число округляется до $rounded"
    }

    is LocalDate -> {
        val relation = if (value.isBefore(FOUNDATION_DATE)) "меньше" else "не меньше"
        val dateText = value.format(DateTimeFormatter.ISO_LOCAL_DATE)
        "Я получил LocalDate = $dateText, эта дата $relation чем дата основания T‑Банка"
    }

    else -> "Мне этот тип неизвестен("
}

private fun plural(n: Int): String =
    when {
        n % 100 in 11..14 -> "символов"
        n % 10 == 1 -> "символ"
        n % 10 in 2..4 -> "символа"
        else -> "символов"
    }

fun main() {
    println(analyse("Молоко"))
    println(analyse(123))
    println(analyse(2.356))
    println(analyse(LocalDate.of(2000, 1, 1)))
    println(analyse(null))
}
