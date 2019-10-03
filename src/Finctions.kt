package geomatry.shapes

fun <T> joinToString(collection: Collection<T>, separator: String, prefix: String, postfix: String) : String{
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()){
        if (index > 0)
            result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(){
    val set = setOf(1, 7, 53)
    val list = listOf(1, 7, 53)
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)


    println("/////////////////////////////////////////\n" +
            "/////////////////////////////////////////")

    println(joinToString(list, ";", "(", ")"))

}