fun main(){
    val n = 1001
    val numberprime = prime1(n)
    println("${numberprime}")

}

fun prime(number: Long): Boolean{
    if (number <=1){
        return false
    }
    if (number <=3){
        return false
    }
    if (number % 2 == 0L || number % 3 == 0L){
        return false
    }
    var i = 5L
    if (i * i <= number) {

    }

}


fun prime1(n: Long): Boolean{

}