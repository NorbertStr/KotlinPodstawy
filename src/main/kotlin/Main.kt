
// Różnica między klasami dziedziczonymi, a interfejsami jest taka, że interfejsy nie przechowują stanu.
// Stan jest to jakaś konkretna wartość. W interfejsie nie można przypisać danych wartości do np zmiennej. Interfejs
// jedynie przechowuje szkielet.
// Najważniejszą różnicą między interfejsami i klasami w kotlinie jest to, że można dziedziczyć wiele interfejsów, a
//klasę można dziedziczyć tylko jedną
interface Animal{

    var weight: Int

    fun eat()
    fun drink()

//    W interfejsie nie możemy przechować ztanu, ale możemy tworzyć funkcje, które nie są abstrakcyjne, czyli takie
//    które mają zawartą wewnątrz interfejsu jakąś interpretację np:
    fun jump(){
        println("jumping")
    }

}

//dziedzicząc interfejs trzeba zaimplementować i nadpisać wszystkie jego prepercje i metody.
class Dog: Animal{
    override var weight: Int = 10

    override fun eat() {
        println("Pies je")
    }

    override fun drink() {
        println("Pies pije")
    }

//    Funkcja jump może być normalnie nadpisana w klasie która dziedziczy interfejs, lub też można jej wogule nie nadpisywać.
    override fun jump() {
        super.jump() // słowo kluczowe super mówi, że instrukcje zawarte w interfejsie/klasie którą dziedziczymy też będą wykonane
        print(" dog")// do tego możemy dodać jeszcze swoje instrukcje
    }

}

fun main(args: Array<String>) {

    val azor = Dog()
    azor.eat()
    azor.drink()
    azor.jump()

}