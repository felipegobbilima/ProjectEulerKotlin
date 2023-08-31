fun main(){

    val n = 100
    val dif = dif1(n)
    println("$dif")

}

fun dif1(n: Int): Long{
    return (n.toLong() * (n + 1) * (3 * n.toLong() * n - n - 2)) / 12
}
