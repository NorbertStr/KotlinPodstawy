
class Person{
    var name = ""
    var surname = ""
    var age = 0
}

fun main(args: Array<String>) {

    val person = Person()
//    Żeby zmienić wartość zmiennej danego obiektu, musimy odwołać się do nazwy tego obiektu i po kropce do odpowiedniej zmiennej:
    person.name = "Jan"
    person.surname = "Kowalski"
    person.age = 33

//    scope functjon apply sprawia, że możemy zrobić to w krótszy sposób, nie pisząc cały czas nazwy obiektu:
    person.apply {
        this.name = "Kacper"
        this.surname = "Kowalkiewicz"
        this.age = 48
    }
//    A nawet możemy to skrócić do takiej formy:
    person.apply {
        name = "Marian"
        surname = "Rak"
        age = 59
    }
}