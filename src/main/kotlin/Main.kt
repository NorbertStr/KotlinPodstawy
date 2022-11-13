
class Person{
    var name = ""
    var surname = ""
    var age = 0

//    metoda zwiększająca wiek
    fun incAge(){
        age++
    }

//    metoda dodająca przyrostek "son" do surname
    fun addConstToSurname(){
        surname += "son"
    }

}



fun main(args: Array<String>) {

    val person = Person()
//    Żeby zmienić wartość zmiennej danego obiektu, musimy odwołać się do nazwy tego obiektu i po kropce do odpowiedniej zmiennej:
    person.name = "Jan"
    person.surname = "Kowalski"
    person.age = 33

    /*
            APPLY:
     */
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

    /*
            LET:
     */

//    "let" pozwala nam wykonać jakiś blok instrukcji i zwrucić ostatnią wartość
    val nameSize = person.name.let { it.length } // W kontekście klamer "it" odnosi się do tej propercji
//    w tym przypadku zwruci nam długość stringa zmiennej name
    println(nameSize)

//    inną rzeczą, do której możemy użyć "let" to sprawdzenie null:
    var coMozeBycNullem: Int? = 4

//    jeśli zapiszemy nazwę naszej propercji ze znakiem zapytania, to blok instrukcji wykona się tylko, jeżeli ta propercja
//    nie będzie nullem
    coMozeBycNullem?.let { nieNull ->
        println("Wartość równa się: $nieNull")
//    Jeśli wartość byłaby nullem to instrukcja nie wykonałaby się.
    }

    /*
            ALSO:
     */

    val newPerson = Person().apply {
        name = "Jan"
        surname = "Kowalski"
        age = 34
    }.also {
        it.incAge()
        it.addConstToSurname()
    }

    println(newPerson.age)
    println(newPerson.surname)

    /*
            RUN
     */

//    "run" odpowiada za inicjalizację, konfigurację oraz obliczenie rezultatu.

    val startEngine = run {
        println("Engine starting...")
        println("....")
        println("...")
        400
    }
    println(startEngine)
// Po uruchomieniu programu zostaną wypisane wszystkie println i ostatnia wartość, czyli 400 zostanie zwrócona.
// Run zachowuje się podobnie jak let z tą różnicą, że nie możemy użyć let samego, czyli np startEngine = let{}.
// Let musi być wykonane na jakimś obiekcie.

    /*
            With
     */

//Służy do grupowania operacji.
    with(newPerson){
        age = 20
        name = "Stefan"
        surname = "Kowalski"
        incAge()
        addConstToSurname()
    }
// Co ważne with zwraca wartość.
    val result = with(newPerson){
        age = 20
        name = "Stefan"
        surname = "Kowalski"
        incAge()
        addConstToSurname()
        "zwrucona wartość result"
    }
 println(result)

}

