package geomatry.shapes

class User(val nickname: String, val isSubscribed: Boolean = true)

fun main(){
    val alice = User("Alice")
    println(alice.isSubscribed)

    val bob = User("Bob", isSubscribed = false)
    println(bob.isSubscribed)
}