fun main(args: Array<String>) {

    if (true) {
        println("Warunek jest prawdziwy")
    }

    /*
     * operatory logiczne
     *  > większy
     *  < mniejszy
     *  >= większy bądź równy
     *  <= mniejszy bądź równy
     *  == równy
     */

    var x = 10
    var y = 12

    if (x > y){
        println("większa liczba to: $x")
    }
    else{
        println("większa liczba to: $y")
    }

    if(x < 10){
        println("x jest mniejszy niż 10")
    }
    else if (x == 10){
        println("x jest równy 10")
    }
    else{
        println("x jest większy niż 10")
    }

    /*
    Operatory logiczne "And" i "OR"
    && - operatot and oznaczający że dwa warunki są prawdziwe
    || - operator or oznaczający że któryś z warunków jest prawdziwy
     */

    var z = "R"
    var k = 133

    // z jest true ale k jest false co daje false
    if (z == "R" && k == 132){
        println("obydwa warunki zostały spełnione")
    }
    else{
        println("Jeden z warunków nie został spełniony")
    }

    if (z == "R" || k == 132){
        println("jeden z warunków został spełnionyn co daje true")
    }

}