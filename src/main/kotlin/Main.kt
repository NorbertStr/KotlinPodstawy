
// Może się wydawać, że klasy abstrakcyjne są bardzo podobne do interfejsów i rzeczywiście tak jest, od strony praktycznej
// mogą się od siebie prawie nie różnić.
// Klasa abstrakcyjna jest to taka klasa, której nie możemy utworzyć obiektu. Możemy za to dziedziczyć po tej klasie i
//utworzyć obiekt dziedziczący.
abstract class Animal(){
//    Podstawowa różnica między klasami abstrakcyjnymi a interfejsami jest to, że w klasie abstrakcyjnej mogę zadeklarować
//    jakiś stan, np. wartości dla zmiennej czego nie mogę zrobić w interfejsie:
    var wieght = 10

//    Jeśli funkcja w klasie abstrakcyjnej nie ma ciała, trzeba zadeklarować ją jako abstrakcyjną. W interfejsach deklaracja
//    abstract jest domyślna.

//    funkcja bez ciała:
    abstract fun eat()
// funckcja zawierająca jakieś ciało:
     fun drink(){
    println("pije")
    }
}

class Dog: Animal(){
//    klasa, która dziedziczy po klasie abstrakcyjnej i sama nie jest abstrakcyjna, musi nadpisać wszystkie funkcje
//    abstrakcyjne tej klasy:
    override fun eat() {
        TODO("Not yet implemented")
    }

}

fun main(args: Array<String>) {


}