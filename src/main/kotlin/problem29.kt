fun main() {
    val limit = 100
    val distinctTerms = HashSet<Double>()

    for (a in 2..limit) {
        for (b in 2..limit) {
            val result = Math.pow(a.toDouble(), b.toDouble())
            distinctTerms.add(result)
        }
    }

    val result = distinctTerms.size
    println("$result")
}

//Código do Chat GPT
//fun main() {
//    val limit = 100
//
//    val distinctTerms = (2..limit).flatMap { a ->
//        (2..limit).map { b ->
//            Math.pow(a.toDouble(), b.toDouble())
//        }
//    }.distinct()
//
//    val count = distinctTerms.size
//    println("O número de termos distintos na sequência é: $count")
//}
