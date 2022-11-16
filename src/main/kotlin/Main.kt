
/*
    W programowaniu jeden obiekt może oddelegować zadanie jakiemuś innemu obiektowi. Kotlin jest jednym z języków,
    który wspiera domyślnie delegate pattern.
 */

interface Base{
    fun print()
}

class BaseImpl(private val x: Int): Base{
    override fun print() {
        print(x)
    }

//Jeśli chcielibyśmy stworzyć drugą taką samą klasę jak BaseImpl nie musimy jej kopiować, co wydłuża kod i jest złą
//Praktyką. Możemy za to posłużyć się oddelegowaniem:
    class BaseImpl2(b: Base): Base by b

}
fun main(args: Array<String>) {

    val baseImpl = BaseImpl(10)
    val baseImpl2 = BaseImpl.BaseImpl2(baseImpl)
    baseImpl2.print()
/*
    Kotlin pozwala też na coś takiego jak delegated properties, czyli oddelegowanie inicjalizacji jakiejś propercji
    do specjalnego mechanizmu. Możemy sami tworzyć takie mechanizmy, ale mamy też do dyspozycji wbudowane.
 */

//    Jednym z takich mechanizmów jest mechanizm o nazwie lazy:
    val x by lazy {
        10
    }
/*`
    Mechanizm lazy pozwala nam odwlec moment obliczenia wartości do czasu pierwszego razu odwołania się w kodzie do
    tej wartości.
*/

}