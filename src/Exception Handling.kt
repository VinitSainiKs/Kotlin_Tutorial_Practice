package geomatry.shapes

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val number: Int = sc.nextInt()
    val percentage = if (number in 0..100)
        number
    else
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")

    println(percentage)
}