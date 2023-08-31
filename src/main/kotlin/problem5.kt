fun main() {
    val p = n(1, 20)
    println("${p}")
}

fun n(start: Int, end: Int): Long {
    var result = 1L

    for (i in start..end) {
        result = lcm(result, i.toLong())
    }

    return result
}

fun s(a: Long, b: Long): Long {
    if (b == 0L) {
        return a
    }
    return s(b, a % b)
}

fun lcm(a: Long, b: Long): Long {
    return (a * b) / s(a, b)
}
