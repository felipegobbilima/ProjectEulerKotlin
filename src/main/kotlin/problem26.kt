fun findLongestRecurring(limit: Int): Int {
    var maxCycleLength = 0
    var result = 0

    for (d in 2 .. limit) {
        val remainders = mutableListOf<Int>()
        var numerator = 1
        var position = 0

        while (true) {
            numerator *= 10
            val remainder = numerator % d

            if (remainder in remainders) {
                val cycleLength = position - remainders.indexOf(remainder)
                if (cycleLength > maxCycleLength) {
                    maxCycleLength = cycleLength
                    result = d
                }
                break
            }

            remainders.add(remainder)
            position++
            numerator = remainder
        }
    }

    return result
}

fun main() {
    val limit = 1000
    val result = findLongestRecurring(limit)
    println("$result")
}

//Código Chat GPT
//fun findLongestRecurringCycle(limit: Int): Int {
//    return (2 until limit).map { d ->
//        val remainders = mutableListOf<Int>()
//        var numerator = 1
//        var position = 0
//
//        val cycleLength = generateSequence {
//            numerator *= 10
//            val quotient = numerator / d
//            val remainder = numerator % d
//
//            if (remainder in remainders) null
//            else {
//                remainders.add(remainder)
//                position++
//                numerator = remainder
//                position - remainders.indexOf(remainder)
//            }
//        }.maxOrNull() ?: 0
//
//        Pair(d, cycleLength)
//    }.maxByOrNull { it.second }?.first ?: 0
//}
//
//fun main() {
//    val limit = 1000
//    val result = findLongestRecurringCycle(limit)
//    println("The value of d < 1000 with the longest recurring cycle is: $result")
//}
