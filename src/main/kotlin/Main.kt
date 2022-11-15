/*
    Infinx functions nie są zbyt użyteczne pozwalają jedynie na ładniejszy zapis.
 */
infix fun String.concate(element: String) = this + element

fun main(args: Array<String>) {

    val result1 = "hej".concate(" Wojtek")
    val result2 = "hej" concate " Wojtek"
    println(result1)
    println(result2)
}