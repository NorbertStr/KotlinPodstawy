
/*
    Kotlin jest silnie typowany, czyli jeśli napiszemy, że coś przyjmuje np. Int, to ten Int musi dostać. Często zdarza się tak, że
    chcemy wykonać jakąś operację, która jest związana z typem, ale my nie wiemy, jaki to jest typ. Generyczność, czyli tak naprawdę
    my mówimy o konkretnym typie, z którym będziemy mieć doczynienia, ale dopiero przy wywołaniu funkcji.
 */

//Funkcja, która pobiera dwie wartości różnych typów i jeśli jeden z nich jest równy null to zwraca null. W innym razie
// tworzy z nich parę.
fun <T: Number?, V> pairOrNull(a: T, b: V): Pair<T & Any, V & Any>? {
    if( a == null || b == null) return null
    else return a to b
}

//Typów generycznych można też używać np. w interfejsach. W interfejsach i klasach mamy dwa dodatkowe polecenia "in" oraz "out".
// Dzięki nim możemy ograniczyć, że któryś z typów może się pojawić tylko na wejściu, albo na wyjściu funkcji. Tak jak w
//  przykładowej funkcji "doSomething"
interface MyInterface<in T, out V>{
    fun doSomething(element: T): V
}

class MyClass <in T, out V>{
    fun makeNois(t: T) {

    }
}
fun main(args: Array<String>) {

    val pair = pairOrNull(2, "ala")
    println(pair)

    val classGeneric = MyClass<Int, Float>()
}