
/*
      Jak w większości języków programowania, tak samo w Kotlinie mamy pewne gotowe rozwiązania tzw. biblioteki.
      Z bibliotek można korzystać w jakiś ramach, czyli nie można ich modyfikować. W Kotlinie mamy mechanizm który
      nazywa się "extension functions" czyli funkcje rozszerzające. Polega to na tym, że tworzymy funkcję i doklejamy
      ją do danej klasy, a kompilator uważa, że ta funkcja pochodzi z tej klasy.
 */

//Aby stworzyć extension "functions" należy podać nazwę funkcji, do której chcemy ją dokleić, a po kropce nazwę
//extension function. W tym przypadku do Int doklejamy funkcje cube, która będzie liczyć sześcian z liczby
fun Int.cube() = this * this * this



fun main(args: Array<String>) {
    val x = 2
    val cube = x.cube()
    println(cube)
}