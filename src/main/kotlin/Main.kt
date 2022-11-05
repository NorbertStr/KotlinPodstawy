
/*
    Domyślnie w kotlinie wszystkie klasy są tzw. final, czyli nie można po nich dziedziczyć.
    W języku programowania Java jest na odwrót domyślnie po każdej klasie można od razu dziedziczyć.
    Jeśli chcemy udostępnić możliwość dziedziczenia po klasie musimy wpisać "open class".
    W Kotlinie możemy dziedziczyć tylko po jednej klasie.

*/

open class Animal{

//  Jeżeli chcemy mieć możliwość nadpisania danej propercji w klasie, która ją dziedziczy, musimy zaznaczyć ją jako "open"
    open var weight = 20
    var legs = 4
    var isHasTail = false
}

// żeby dziedziczyć po danej klasie musimy ją wpisać po dwukropku.
class  Dog(): Animal() {
//    dzięki temu, że mamy ustawioną zmienną "weight" jako open możemy ją nadpisać:
    override var weight: Int
        get() = 10 // przypisałem do zmiennej weight 10
        set(value) {}
//    można to też zapisać jako:  override var weight: Int = 10
}

// Dlatego, że klasa Cat dziedziczy po klasie Animal tzn. że jest typu Cat i Animal.
class Cat():Animal(){

}

fun main(args: Array<String>) {

    val azor = Dog()
    println(azor.weight)
}