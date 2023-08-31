

fun main() {

    fun fib(n: Int): Int {
        if (n == 1) return 1
        if (n == 2) return 2

        return fib(n - 1) + fib(n - 2)

    }

    var soma = 0

    for (n in 1 .. 4000000) {
        val fib = fib(n)
        if (fib >= 4000000) break
        if (fib % 2 == 0) soma += fib

    }
    println("total:${soma}")
}