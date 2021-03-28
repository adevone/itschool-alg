package eduard

import java.util.*

fun main() {
    val inputScanner = Scanner(System.`in`)

    val n = inputScanner.nextInt()

    val list = mutableListOf<Int>()

    repeat(n) {
        val a = inputScanner.nextInt()
        list.add(a)
    }

    var maxNumber = 0
    // для каждого значения у списка мы применяем функцию if)
    list.forEach(){ a ->
        if (maxNumber < a){
            maxNumber = a
        }
    }
    println(maxNumber)
}

//  maxNumber < a -> maxNumber = a например maxNumber = 0, а = 1
//  maxNumber > a -> maxNumber = maxNumber, например maxNumber = 1, a = 0
//  maxNumber = a -> maxNumber = maxNumber, например maxNumber = 1, a = 1
