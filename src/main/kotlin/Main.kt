fun main(args: Array<String>) {

    //tablica z trzema elementami
    val tablica = arrayOf(123,23,35)

    //żeby dostać się do tablicy trzeba wpisać nazwa zmiennej i indeks np tablica[0]
    println("pierwsza wartość w tablicy to:")
    println(tablica[0])

    //Tworzenie listy
    val list = listOf(1f,2f) //kiedy  lista zawiera jakieś wartości typ listy dobierany jest automatycznie

    //można też podać typ listy w "<>"
    val list2 = listOf<String>()

    /*
    lista różni się tym od tablicy że w liście nie można podmieniać przypisanych wartości
     */

    //podmiana wartości w tablicy:
    tablica[0] = 9
    println("podmieniona wartość na pierwszym miejscu w tablicy to:")
    println(tablica[0])

    //mutableList - jest to lista która zawiera seter czyli można podmieniać w niej wartości
    val mutableList = mutableListOf(1f,2f)
    mutableList[0] = 33f

    /* Do raz utworzonej tablicy nie da się dodawać nowych elementów czyli do tablicy która zawiera trzy
    elementy nie możemy dodać czwartego
     */

    //Jeśli potrzebujemy tablicy którą da się rozszeżać musimy skorzystać z ArrayList
    val arrayList = ArrayList<Float>()
    arrayList.add(3f)
    arrayList.add(55f)

    //pętla for each jest w stanie iterować po kolekcjach czyli tablicach, listach itp

    val tablicaPetli = arrayOf("ala", "ma", "kota", "a", "kot", "ma", "ale")
    for (element in tablicaPetli){
        println(element)
    }
}