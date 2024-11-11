fun main() {
    println("Введите строку для подсчета символов:")
    val input = readLine()

    // Проверяем, что строка не пустая
    if (input.isNullOrEmpty()) {
        println("Ошибка: строка не может быть пустой.")
        return
    }

    val charCount = countCharacters(input)
    printCharacterCount(charCount)
}

fun countCharacters(input: String): Map<Char, Int> {
    val charCountMap = mutableMapOf<Char, Int>()

    for (char in input) {
        charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
    }

    return charCountMap
}

fun printCharacterCount(charCount: Map<Char, Int>) {
    val sortedCharCount = charCount.toSortedMap()

    for ((char, count) in sortedCharCount) {
        println("$char - $count")
    }
}

