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

    println("${index}")
}
