package geomatry.shapes

class Client(val name: String, val postalCode: Int){
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}

fun main(){
    val client1 = Client("Alice", 12345)
    println(client1)
}