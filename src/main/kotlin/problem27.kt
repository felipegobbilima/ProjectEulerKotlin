fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false
    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
    }
    return true
}

fun findCoefficients(limit: Int): Int {
    var maxPrimes = 0
    var product = 0

    for (a in -limit + 1 .. limit) {
        for (b in -limit..limit) {
            var n = 0
            while (isPrime(n * n + a * n + b)) {
                n++
            }
            if (n > maxPrimes) {
                maxPrimes = n
                product = a * b
            }
        }
    }

    return product
}

fun main() {
    val limit = 1000
    val result = findCoefficients(limit)
    println("$result")
}

//Código chat GPT
//import kotlin.math.abs
//
//fun isPrime(n: Int): Boolean {
//    if (n <= 1) return false
//    if (n <= 3) return true
//    if (n % 2 == 0 || n % 3 == 0) return false
//    val limit = Math.sqrt(n.toDouble()).toInt() + 1
//    return (5..limit step 6).none { i -> n % i == 0 || n % (i + 2) == 0 }
//}
//
//data class QuadraticResult(val a: Int, val b: Int, val consecutivePrimes: Int)
//
//fun findMaxConsecutivePrimes(limit: Int): QuadraticResult {
//    val coefficientPairs = (-limit + 1 until limit).flatMap { a ->
//        (-limit..limit).map { b -> Pair(a, b) }
//    }
//
//    return coefficientPairs.map { (a, b) ->
//        var n = 0
//        while (isPrime(n * n + a * n + b)) {
//            n++
//        }
//        QuadraticResult(a, b, n)
//    }.maxByOrNull { it.consecutivePrimes }!!
//}
//
//fun main() {
//    val limit = 1000
//    val result = findMaxConsecutivePrimes(limit)
//    val product = result.a * result.b
//    println("O produto dos coeficientes a e b é: $product")
//}
