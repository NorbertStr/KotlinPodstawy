
//funkcja służąca do dodawania przyjmuje dwa parametry w nagłówku funkcij a i b które są typu Int i zwraca też Int
fun dodaj (a: Int, b:Int): Int{
    return a + b //zwraca wynik dodawania a + b
}

// Funkcja która sprawdza, czy liczba jest parzysta
fun czyParzysta(liczba:Int): Boolean {
    if(liczba%2==0)return true
    else return false
}
//funkcje można zapisać w krótszy sposób:
fun czyParzysta2(liczba:Int): Boolean {
    return liczba%2==0
}

//funkcja obliczająca silnie
fun silnia(input: Int): Int{
    return if(input == 0 || input == 1) 1
    else{
        var silnia = 1
        for( i in 2.. input){
            silnia *= i
        }
        silnia
    }
}

// Czasem funkcja może mieć opcjonalne parametry czyli takie które możemy nadpisać, ale nie musimy
//parametr liczba jest parametrem wymaganym, czyli takim, który musimy podać przy wywołaniu funkcji
// parametr mnożnik nie jest parametrem wymaganym, czyli można go nadpisać, ale nie jest to wymagane, bo domyślnie ma on wartość 10

fun opcjonalneParametry(liczba:Int, mnożnik: Int = 10){

}

fun main(args: Array<String>) {

//    Przypisuje do zmiennej wynik funkcje dodaj i nadaje wartości parametrą a = 10 i b = 20
    val wynik = dodaj(10, 20)

//    sprawdza poprzez funkcje czyParzysta czy wynik jest parzysty, czy nie i wypisuje to
    println(czyParzysta(wynik))

//    wywołanie funkcji silnia
    println(silnia(4))

    //podając parametry funkcji trzeba je zawsze podawać według kolejności, czyli w tym przykładzie najpierw liczba później mnożnik
    opcjonalneParametry(10,10)

//  W kotlinie istnieje możliwości zmiany kolejności parametrów, ale tylko wtedy kiedy się je wszystkie jawnie wypisze
    opcjonalneParametry(mnożnik = 200, liczba = 23)
}

