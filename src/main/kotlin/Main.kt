import com.sun.source.doctree.UnknownInlineTagTree
import java.io.File
import java.io.FileOutputStream
import java.io.FileReader
import java.lang.IllegalArgumentException
import kotlin.system.exitProcess


fun main(args: Array<String>) {

    val fm = MyFileManages()
    while (true) {
        showMenu()
        performFileOperation(fm = fm, opt = getUserInput())
    }
}

fun performFileOperation(fm: MyFileManages, opt: Int) {
    when(opt){
        1 -> performOpenFile(fm)
        2 -> performWriteFile(fm)
        3 -> performDeleteFile(fm)
        4 -> exitProcess(0)
    }

}

fun performDeleteFile(fm: MyFileManages) {
    fm.delete(path = setFilePath(),
        onFailure = { println(it)},
        onCompleted =  {isSucces ->
        if (isSucces) println("poprawnie usunięto plik")
        else println("Coś poszło nie tak") }
    )
}

fun performWriteFile(fm: MyFileManages) {
    println("Wprowadź tekst >>")
    val text = readLine()!!.toString()
    fm.write(path = setFilePath(), text = text)
}

fun performOpenFile(fm: MyFileManages) {
    fm.open(path = setFilePath(),
        onFailure = { println(it) },
        onCompleted = {lines -> fm.printFile(lines)}
    )
}

fun getUserInput(): Int {
    print("Wybierz opcję >> ")

    while (true){
        try {
            val input = readLine()!!.toInt()
            if (input !in 1..4) throw IllegalArgumentException("Liczba jest spoza zakresu")
            return input
        }catch (e:Exception){
            println(e)
        }
    }
}

fun showMenu(){
    println("Menu")
    println("1. Otwórz plik")
    println("2. Zapisz plik")
    println("3. Usuń plik")
    println("4. Wyjdź ")

}

interface  FileManagerInterface{
    fun open(path: String,
             onFailure: (Exception) -> Unit,
             onCompleted: (List<String>) -> Unit
    )
    fun delete(path: String,
               onFailure: (Exception) -> Unit,
               onCompleted: (Boolean) -> Unit)
    fun write(path: String, text: String)
    fun printFile(lines: List<String>)
}

class MyFileManages(): FileManagerInterface{
    override fun open(path: String,
                      onFailure: (Exception) -> Unit,
                      onCompleted: (List<String>) -> Unit) {

        var fileReader: FileReader? = null
        try {
            fileReader = FileReader(path)
            fileReader.readLines()?.let { onCompleted(it) }
        }catch (e: Exception){
            onFailure(e)
        }finally {
            fileReader?.close()
        }
    }

    override fun delete(path: String,
                        onFailure: (Exception) -> Unit,
                        onCompleted: (Boolean) -> Unit) {

        val file = File(path)

        try {
            val result = file.delete()
            onCompleted(result)
        }catch (e: Exception){
            onFailure(e)
        }
    }

    override fun write(path: String,
                       text: String) {
        val file = File(path)
        FileOutputStream(file).use{out ->
            out.write(text.toByteArray())
        }

    }

    override fun printFile(lines: List<String>) {
        for (line in lines){
            println(line)
        }
    }

}

fun setFilePath(): String {
    print("Wskaż scieżkę do pliku: ")
    return readLine()!!.toString()
}