
/*
    Enum, czyli tryb wyliczeniowy jest to taka konstrukcja, która pozwala nam wyliczać konkretne elementy.
 */
enum class Orientation{
    PORTRAIT, LANDSCAPE, REVERSED_PORTRAIT, REVERSED_LANDSCAPE
}
fun setOrientation(orientation: Orientation){
    when (orientation){
        Orientation.PORTRAIT -> {}
        Orientation.LANDSCAPE -> {}
        Orientation.REVERSED_PORTRAIT -> {}
        Orientation.REVERSED_LANDSCAPE -> {}
    }
}

fun main(args: Array<String>) {


}