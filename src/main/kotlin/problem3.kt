

//código do CHAT GPT
//fun main() {
//    val number = 600851475143L
//    val largestPrimeFactor = findLargestPrimeFactor(number)
//    println("O maior fator primo de $number é $largestPrimeFactor")
//}
//
//fun findLargestPrimeFactor(number: Long): Long {
//    var n = number
//    var largestFactor = 0L
//
//    while (n % 2 == 0L) {
//        largestFactor = 2L
//        n /= 2
//    }
//
//    var divisor = 3L
//    while (divisor * divisor <= n) {
//        while (n % divisor == 0L) {
//            largestFactor = divisor
//            n /= divisor
//        }
//        divisor += 2
//    }
//
//    if (n > 2) {
//        largestFactor = n
//    }
//
//    return largestFactor
//}
