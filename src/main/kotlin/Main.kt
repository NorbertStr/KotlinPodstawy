fun main(args: Array<String>) {

    // when jest to kaskadowe sprawdzanie warunków. W java jest to polecenie switch

    var liczba = 153

    when (liczba) {
        153 -> println("liczba jest równa 153")
        is Int -> println("liczba jest Intem")
        in 100..200 -> println("Mieści się w zakresie od 100 do 200")
        else -> println("żaden z powyższych warunków nie jest prawdziwy")
    }
    //Przy kaskadowym sprawdzeniu warunków wykonuje się tylko i wyłącznie ten pierwszy prawdziwy

    //When możemy czasem przypisać do zmiennej i może on się zachowywać jako wyrażenie. W tedy instrukcja musi zawierać blok else

    val zmienna = when (liczba) {
        153 -> 100
        else -> 150
    }
//    Nie musimy przytym ograniczać się do typów np:
    val zmienna2 = when (liczba) {
        153 -> "String"
        else -> 40f
    }

//    Później możemy to jeszcze rozbudować :
    when(zmienna2){
        is Float -> zmienna2 + 3f
        is String -> println(zmienna2)
    }

}