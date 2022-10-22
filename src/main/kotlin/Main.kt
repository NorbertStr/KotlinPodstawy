fun main(args: Array<String>) {

    // silnia "n!" jest to iloczyn wszystkich liczb 1*2*3*4...*n

    /*
    w kotlinie są dwa rodzaje typów. Każdy typ w kotlinie ma swojego brata bliźniaka np.
    Int i Int?
    String i String?
    typy ze znakiem zapytania dopuszczają to, że ich wartość może być null
     */

    /*
    Istnieją dwa operatory w Kotlin "!!" i "?".  Operator "!!" gwarantuje, że podana wartość nie będzie nullem, jeżeli
    jednak będzie to program się wysypie. Operator "?" dopuszcz, że podana wartość może być nullem.
     */

    //zczytuje wartość podaną przez użytkownika do zmiennej input i konwertuje ją na Int. Za pomocą  "!!" gwarantuje
    //że wartość nie będzie nullem
    println("podaj liczbę nie ujemną: ")
    val input = readLine()!!.toInt()

    //Silnia dla wartości 0 oraz 1 zwraca wartość 1 dla wszystkich innych zwraca iloczyn od 1 do n.

    //sprawdza czy zmienna input jest równa 0 lub 1
    if(input == 0 || input == 1) println("Wynik to: 1")
    else{
        var silnia = 1
        for (i in 2..input){
            silnia *= i
        }
        println("wynik to: $silnia")
    }
}