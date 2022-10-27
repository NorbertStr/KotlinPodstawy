import kotlin.random.Random

fun main(args: Array<String>) {

    //Todo: 1. Wypisz planszę
    //Todo: 2. Pobierz pole od użytkownika
    //Todo: 3. Pobierz pole od komputera
    //Todo: 4. Sprawdź wygraną

//    Stworzenie planszy do gry za pomocą tablicy, która ma 9 elementów i domyślnie każdy element ma wartość 0
    val board = Array(9) { 0 }
    var champion:String? = null

    while (true){
        drawBoard(board)
        getUserMove(board)
        champion = getWinner(board)

        if (champion != null){
            println(champion)
            println("-----------")
            drawBoard(board)
            break
        }

        if(isGameEnd(board)){
            println("Remis")
            break
        }

        getComputerMove(board)

        champion = getWinner(board)

        if (champion != null){
            println(champion)
            println("-----------")
            drawBoard(board)
            break
        }

        if(isGameEnd(board)){
            println("Remis")
            break
        }
    }
}

//funkcja służąca do rysowania tablicy:
fun drawBoard(board: Array<Int>) {

    for (i in 0..8) {
        if (i != 0 && i % 3 == 0) println()
        print("${board[i]}|")
    }
    println()
}

//funkcja do pobierania ruchu od gracza
fun getUserMove(board: Array<Int>) {

    while (true) {
        print("Podaj numer pola (0-8): ")
        //pobiera liczbę od użytkownika i przypisuje ją do zmiennej
        val userMove = readln()!!.toInt()

        // Sprawdza, czy liczba podana przez użytkownika jest z przedziału od 1 do 8. Jeśli nie wraca na początek pętli
        if (userMove !in 0..8) {
            println("Nie ma takiego pola")
            continue
        }

        // Sprawdza, czy podane pole nie jest już przypadkiem zajęte. Jeśli jest wraca na początek pętli
        if (board[userMove] != 0) {
            println("Pole jest zajęte!")
            continue
        }


        board[userMove] = 1
        break
    }
}

fun getComputerMove(board: Array<Int>) {

    while (true) {
        //losuje jedną liczbę od 1 do 8 i przypisuje ją do zmiennej
        val computerMove = Random.nextInt(0, 9)
        // Sprawdza, czy dane pole nie jest już zajęte. Jeśli wynosi 0 jet wolne. Jeśli jest różne od 0 znaczy, że jest zajęte.
        if (board[computerMove] != 0) {
            continue
        }

        board[computerMove] = -1
        break
    }
}

// Funkcja do sprawdzania, czy w poziomych kolumnach są te same symbole
fun checkRows(board: Array<Int>): Int? {
    var sum = 0
    for (i in 0..8) {
        if (i != 0 && i % 3==0 ) sum = 0
        sum += board[i]
        if(sum == 3 || sum == -3) return sum
    }
    return null
}

// funkcja służąca do sprawdzania, czy w pionowych kolumnach są te same znaki
fun checkColums(board: Array<Int>): Int? {
    for(i in 0..2){
        val sum = board[0+i] + board[3+i] + board[6+i]
        if( sum == 3 || sum == -3) return sum
    }
    return null
}

// Funkcja służąca, do sprawdzania tych samych symboli po przekątnej
fun checkDiagonal(board: Array<Int>): Int? {
    val diagonal1 = board[0] + board[4] + board[8]
    val diagonal2 = board[6] + board[4] + board[2]

    if (diagonal1 == 3 || diagonal1 == -3) return diagonal1
    if (diagonal2 == 3 || diagonal2 == -3) return diagonal2
    return  null
}

// Funkcja, która sprawdza, czy gra dobiegła końca
fun isGameEnd(board: Array<Int>): Boolean {
    for( i in board){
        if(i == 0) return false
    }
    return true
}

// Funkcja, która wypisuje zwycięzcę
fun getWinner(board: Array<Int>): String? {
    if (checkRows(board) == 3) return "Wygrał gracz"
    if (checkRows(board) == -3) return "Wygrał komputer"

    if (checkColums(board) == 3) return "Wygrał gracz"
    if (checkColums(board) == -3) return "Wygrał komputer"

    if (checkDiagonal(board) == 3) return "Wygrał gracz"
    if (checkDiagonal(board) == -3) return "Wygrał komputer"

    return null

}
