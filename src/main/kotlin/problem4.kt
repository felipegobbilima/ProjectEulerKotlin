fun main(){
    var palindrome = f (100, 999)
    println("${palindrome}")
}

fun f(comeco: Int, fim: Int): Int{

    var palindrome = 0
    for(i in comeco .. fim){
        for (j in i .. fim){
            val product = i * j
            if (n(product) && product > palindrome) {
                palindrome = product
            }
        }
    }
    return palindrome

}
fun n(number: Int): Boolean {
    val soma = number.toString()
    return soma == soma.reversed()

}

