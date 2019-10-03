package geomatry.shapes

import kotlin.random.Random

class Rectangle(val height: Int, val width: Int){
    val isSqure: Boolean
    get() {
        println("Height -> $height \nWidth -> $width")
        return height == width
    }
}

fun createRandomRectangle() : Rectangle{
    return Rectangle(Random.nextInt(), Random.nextInt())
}

fun main(){
    val rectangle = Rectangle(5, 5)
    println(rectangle.isSqure)
    println(createRandomRectangle().isSqure)
}