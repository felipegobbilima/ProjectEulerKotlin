fun main() {
    val result = generateSequence(10L) { it + 1 }
        .filter { isPrime(it) }
        .filter { hasEightPrimeFamilyMembers(it) }
        .first()

    println("O menor primo que faz parte de uma família de oito primos é: $result")
}

fun hasEightPrimeFamilyMembers(number: Long): Boolean {
    val numberStr = number.toString()
    val distinctDigits = numberStr.toSet()

    for (digit in distinctDigits) {
        val familyMembers = (0..9)
            .map { digit.toString() }
            .map { numberStr.replace(it, "*") }
            .count { isPrime(it.replace("*", digit.toString()).toLong()) }

        if (familyMembers >= 8) {
            return true
        }
    }

    return false
}

fun isPrime(number: Long): Boolean {
    if (number <= 1) {
        return false
    }
    if (number <= 3) {
        return true
    }
    if (number % 2 == 0L || number % 3 == 0L) {
        return false
    }
    var i = 5L
    while (i * i <= number) {
        if (number % i == 0L || number % (i + 2) == 0L) {
            return false
        }
        i += 6
    }
    return true
}
