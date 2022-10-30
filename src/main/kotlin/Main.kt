/*
    W kotlinie mamy trzy modyfikatory dostępu
    1. public - modyfikator private sprawia, że metoda/klasa jest widoczna wszędzie i możemy się do niej odwołać z
    każdego miejsca kodu. Modyfikator public jest w kotlinie modyfikatorem domyślnym, czyli nie musimy go pisać
    przed klasą lub metodą.

    2. private - sprawia że dana metoda będzie dostępna tylko w obrębie klasy zawierającej tę metodę i nigdzie indziej.
    Jeśli natomiast chodzi o klasę private, będzie ona widoczna tylko w obrębie pliku zawierającego tę klasę i w żadnym
    innym utworzonym pliku.

    3. protected - działa tak samo, jak modyfikator private tylko z takim wyjątkiem, że funkcje / klasy są widoczne dla
    klas dziedziczących je
 */

class PrzykładowaKlasa{
    fun przykladowaFunkcjaPubliczna(){

    }

    private fun przykladowaFunkcjaPrywatna(){

    }

}

private class PrzykladowaKlasaPrywatna{

}



fun main(args: Array<String>) {


}