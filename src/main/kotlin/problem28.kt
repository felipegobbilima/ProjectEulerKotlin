fun main() {
    val spiralSize = 1001
    var sum = 1
    var value = 1
    var step = 2

    for (i in 1 until  spiralSize / 2 + 1) {
        for (j in 1..4) {
            value += step
            sum += value
        }
        step += 2
    }

    println("$sum")
}

//Código Chat GPT
//fun main() {
//    val gridSize = 1001
//
//    val diagonalValues = generateSequence(1) { it + 2 }
//        .takeWhile { it <= gridSize }
//        .flatMap { generateSequence(it * it) { previous -> previous - it + 2 } }
//        .sum()
//
//    println("A soma dos números nas diagonais da espiral é: $diagonalValues")
//}

