
/*
    Funkcje mogą zawierać w sobie inne funkcje lub nawet jedna funkcja może zwracać drugą.
    Kotlin oprócz tego, że wspiera paradygmat obiektowy, to jeszcze po części wspiera paradygmat funkcyjny.
    W paradygmacie funkcyjnym funkcje odgrywają najważniejszą rolę. W kotlinie jako argument możemy przekazywać
    dowolną funkcję.
 */

fun doOperation(a: Int, b: Int,
                operation:(Int, Int) -> Int): Int {     //przekazuje do konstruktora inną funkcję, która pobiera dwa Int i zwraca Int

    return operation(a,b) // zwraca funkcję i przypisuje jej dwie zmienne: a i b.
}

//Dwie funkcje, które można przekazać do konstruktora funkcji doOperation, gdyż pobierają dwa Int i zwracają Int
fun multiply(a: Int, b: Int) = a*b
fun minus (a: Int, b: Int) = a-b

fun main(args: Array<String>) {

    //Aby przekazać funkcję do konstruktora trzeba użyć znaków "::" np ::minus
    val wynik = doOperation(5,2, ::minus)
    println(wynik)

}