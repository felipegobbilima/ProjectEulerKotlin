import java.math.BigInteger

fun main() {
    var a = BigInteger("1")
    var b = BigInteger("1")
    var index = 2

    while (true) {
        val next = a + b
        a = b
        b = next
        index++

        if (b.toString().length >= 1000) {
            break
        }
    }

    println("$index")
}

//Código do Chat GPT
//import java.math.BigInteger
//
//tailrec fun findFibonacciWithDigits(digits: Int, a: BigInteger, b: BigInteger, index: Int): Int =
//    if (b.toString().length >= digits) index
//    else findFibonacciWithDigits(digits, b, a + b, index + 1)
//
//fun main() {
//    val targetDigits = 1000
//    val result = findFibonacciWithDigits(targetDigits, BigInteger.ONE, BigInteger.ONE, 2)
//    println("O primeiro termo na sequência de Fibonacci com 1000 dígitos é F$result.")
//}

