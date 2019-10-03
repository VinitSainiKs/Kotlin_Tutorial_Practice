package geomatry.shapes

fun fizzBuzz(i: Int) = when{
    i%3 == 0 -> "Fizz"
    i%5 == 0 -> "Buzz"
    i%7 == 0 -> "FizzBuzz"
    else -> i
}

fun isLetter(char: Char) = char in 'a'..'z' || char in 'A'..'Z'
fun isNotDigit(char: Char) = char !in '0'..'9'

fun main(){
    for (i in 1..10){
        println(fizzBuzz(i))
    }
     println("-----------------------------------\n" +
             "-----------------------------------")
    for (i in 10 downTo 1 step 1){
        println(fizzBuzz(i))
    }

    println("fun isLetter -> ${isLetter('c')}")
    println("fun isNotDigit -> ${isNotDigit('c')}")
}