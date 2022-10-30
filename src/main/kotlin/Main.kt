
// Klasa jest przepisem jak stworzyć obiekt
class Pracownik {
    val imie = "Przemek"
    val nazwisko = "Kowalski"
    var wiek = 32
    val pesel = 123452321
}
//    Konstruktor to powiedzenie, jakie parametry są wymagane, aby utworzyć konkretną instancję klasy (obiekt)
class PracownikZKonstruktorem(val imie: String, val nazwisko: String, var wiek: Int, val pesel:Int){

//    Jeśli przeniesiemy funkcję wewnątrz klasy, staje się ona metodą np.
    fun doSomething(){

    }

//    funkcja do aktualizacji wieku pracownika
    fun aktualizujWiek(wiek: Int){
//        żeby wskazać na daną propercję zawartą w klasie, trzeba użyć słówka kluczowego "this"
        this.wiek = wiek
    }

/*
    "init" - jest to specjalna instrukcja, która wykonuje się w momencie tworzenia obiektu,
    Jeśli tworzymy jakiś obiekt to możemy chcieć, aby zaraz po utworzeniu obiektu coś się wykonało.
    Taką instrukcję możemy zawrzeć w bloku "init"
 */
    init {
        println("Imie: $imie, Nazwisko: $nazwisko") //W tym przypadku zaraz po utworzeniu obiektu program wypisuje w konsoli imię i nazwisko.
    }
}

fun main(args: Array<String>) {

//    Obiekt jest konkretną reprezentacją klasy
    val pracownik = Pracownik()

    //Aby, dostać się do konkretnej proporcji klasy używamy kropki np. pracownik.imie
    println(pracownik.imie)

    val pracownik2 = PracownikZKonstruktorem("Jan", "Kowalski", 32, 3343434)
    val pracownik3 = PracownikZKonstruktorem("Gerwazy","Jarząbek", 66, 344343)
    println("Pracownik 2 : ${pracownik2.imie}")
    println("Pracownik 3 : ${pracownik3.imie}")

//    aby wywołać metodę zawartą w danej klasie, trzeba na utworzonym obiekcie odnieść się do niej za pomocą kropki.
    pracownik2.doSomething()

}



