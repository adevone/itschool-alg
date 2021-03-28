package eduard

import java.util.*

//fun main(){
//    Scanner - конруктор сканнера и туда кладем переменную, in - стандартный поток к терминалу,где
//    будет вводить,
//    val inputScanner = Scanner(System.`in`)
//    val n = inputScanner.nextInt()
//    val list = mutableListOf<Int>()
//    повторение n
//    repeat(n){
//        val a = inputScanner.nextInt()
//    add добавляет в list значение a
//        list.add(a)
//    }
//    val reversList = list.reversed()
//    val formattedList = reversList.joinToString( separator = " ")
//    println(formattedList)
//}
fun main(){
    val inputScanner = Scanner(System.`in`)

    val n = inputScanner.nextInt()

    val list = mutableListOf<Int>()

    repeat(n){
        val a = inputScanner.nextInt()
        list.add(a)
    }

    val maxNomber = list.max()

    println(maxNomber)
}




