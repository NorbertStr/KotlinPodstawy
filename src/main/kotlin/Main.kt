
fun doOperation(a: Int,
                b: Int,
                operation:(Int, Int) -> Int): Int{
    return operation(a,b)
}

fun main(args: Array<String>) {
/*
 Funkcje, które nie mają nazwy, nazywamy funkcjami anonimowymi. Wykorzystujemy je wtedy, kiedy z danej funkcji chcemy
 skorzystać tylko w jednym przypadku i nie będzie ona nam potrzebna gdzieś indziej.
 Lambda jest taką właśnie funkcją anonimową i ma następującą strukturę:
 w nawiasach klamrowych wpisujemy parametry a po strzałce to, co się ma dziać np {a,b -> a+b}.
 */
    val wynik = doOperation(2,4,{a,b -> a+b})

    println(wynik)

// kiedy mamy kilka operacji w ciele lambdy {a,b -> a+b, a-b, a*b} to wykonają się one wszystkie, ale tylko ostatnia będzie zwrócona.
    val wynik2 = doOperation(2,4,
        {a,b -> a+b
            a-b
            a+2})

    println(wynik2)

//    Jeśli ostatnim paremetrem funkcji jest jakaś operacja lub funkcja to możemy ją wyżucić poza nawias
    val wynik3 = doOperation(3,8){a, b -> a+b}
    println(wynik3)
}
