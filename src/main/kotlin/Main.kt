import kotlin.random.Random

fun main(args: Array<String>) {

    // inkrementacja od 0 do 10
    for(i in 0..10){
        println(i)
    }

    println("\n skok o dwa")


    //skok o 2
    for(i in 0..10  step 2) println(i)

    println("\n inkrementacja w dół od 10 do 0")

    // inkrementacja w dół od 10 do 0
    for(i in 10 downTo  0 ) println(i)

    println("\n inkrementacja do 10 z wyłączeniem 10")

    // i in 0..9 == 0 until 10
    for (i in 0 until 10) println(i)

    // ----------PĘTLA WHILE-----------
    // W pętli while wykonujemy instrukcje tak długo jak warunek jest prawdziwy

    println("\n Pętla while")

    var licznik = 0
    while(licznik > 10){
        println(licznik)
        licznik ++
    }



    //--------Pętla do while----------
    /* jest ona podobna do pętli while z tą różnicą, że warunek kończący jest na samym dole
    Oznacza to, że ta petla wykona się zawsze przynajmniej raz
     */

    println("\n pętla do while")

    do {
        println("operacja wykonana mimo, że warunek jest false")
    } while (false)

    // --------- słowa kluczowe continue i breake------------

    // break słóży do kończenia pętli

    println("\n Słowo kluczowe break")

    var counter = 0
    while (true){
        counter ++
        val rand = Random.nextInt()
        if (rand%2 == 0) break
    }

    println(counter)

    // countinue przerywa aktualne przejście pętli ale nie kończy jej

    println("\n słowo kluczowe continue")

    for(i in 0..10){
        if (i%2 == 0) continue
        println(i)
    }

}