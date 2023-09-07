

//Código do chat GPT
//import java.util.*
//import kotlin.collections.ArrayList
//
//fun main() {
//    val result = findLowestSumForFivePrimes()
//    println("The lowest sum for a set of five primes is: $result")
//}
//
//fun findLowestSumForFivePrimes(): Long {
//    val primes = generatePrimes(10000) // Generate a list of prime numbers up to a reasonable limit
//
//    for (i in 0 until primes.size - 4) {
//        for (j in i + 1 until primes.size - 3) {
//            if (areConcatenationsPrime(primes[i], primes[j])) {
//                for (k in j + 1 until primes.size - 2) {
//                    if (areConcatenationsPrime(primes[i], primes[k]) && areConcatenationsPrime(primes[j], primes[k])) {
//                        for (l in k + 1 until primes.size - 1) {
//                            if (areConcatenationsPrime(primes[i], primes[l]) && areConcatenationsPrime(primes[j], primes[l]) && areConcatenationsPrime(primes[k], primes[l])) {
//                                for (m in l + 1 until primes.size) {
//                                    if (areConcatenationsPrime(primes[i], primes[m]) &&
//                                        areConcatenationsPrime(primes[j], primes[m]) &&
//                                        areConcatenationsPrime(primes[k], primes[m]) &&
//                                        areConcatenationsPrime(primes[l], primes[m])
//                                    ) {
//                                        return primes[i] + primes[j] + primes[k] + primes[l] + primes[m]
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    return 0
//}
//
//fun areConcatenationsPrime(a: Long, b: Long): Boolean {
//    val ab = "$a$b".toLong()
//    val ba = "$b$a".toLong()
//    return isPrime(ab) && isPrime(ba)
//}
//
//fun generatePrimes(limit: Int): ArrayList<Long> {
//    val sieve = BooleanArray(limit + 1) { true }
//    val primes = ArrayList<Long>()
//
//    for (p in 2 until limit) {
//        if (sieve[p]) {
//            primes.add(p.toLong())
//
//            for (i in p * p until limit step p) {
//                sieve[i] = false
//            }
//        }
//    }
//
//    return primes
//}
//
//fun isPrime(n: Long): Boolean {
//    if (n <= 1) return false
//    if (n <= 3) return true
//    if ((n % 2).toInt() == 0 || (n % 3).toInt() == 0) return false
//
//    var i = 5
//    while (i * i <= n) {
//        if ((n % i).toInt() == 0 || (n % (i + 2)).toInt() == 0) return false
//        i += 6
//    }
//
//    return true
//}
