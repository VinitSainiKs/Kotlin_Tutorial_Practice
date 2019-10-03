package geomatry.shapes

class User1(val name: String){
    var address: String = "Unspecified"
    set(value: String){
        println("""Address was changed for $name: "$field" -> "$value".""".trimIndent())
        field = value
    }
}

fun main(){
    val user = User1("Alice")
    user.address = "Elsenheimerstraße 47, 80687 München"
}