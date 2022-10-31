
class Worker(val name: String, val surname: String, var experience: Int, var salary: Int){

}

class Manager(){

//    ArrayList o nazwie workerList zawierająca elementy typu klasy Worker
    private val workersList = ArrayList<Worker>()

//    funkcja pozwalająca dodawać do workerList nowe, pojedyńcze  elementy typu klasy Worker
    fun addWorker(worker: Worker): Boolean {
        return workersList.add(worker)
    }

//    Funkcja pozwalająca usuwać pojedyńcze elementy typu Worker z workerList
    fun removeWorker(worker: Worker): Boolean {
        return workersList.remove(worker)
    }

//    Funkcja pozwalająca dodawać wiele elementów typu klasy worker do workerList
    fun addAllWorkers(list: List<Worker>): Boolean {
        return workersList.addAll(list)
    }

//    Funkcja do liczenia średniej salary pracowników
    fun getAverageSalary(): Float{
        val sum = getSumOfSalaries()
        val workersNumber = workersList.size
        return sum.toFloat() / workersNumber
    }

//    Funkcja pomocnicza służąca do sumowania salary wszystkich pracowników
    private fun getSumOfSalaries(): Int {
        var sum = 0

        for(worker in workersList){
            sum += worker.salary
        }
        return sum
    }

//Funkcja służąca do wyświetlania danych o pracownikach
    fun printWorkersData(){
        for (worker in workersList){
            println("--------------------------------")
            println("${worker.name} ${worker.surname}")
            println("Salary: ${worker.salary}")
            println("Experience: ${worker.experience}")
            println("----------------------------------")
        }
    }


}





fun main(args: Array<String>) {

//    obiekty klasy Worker
    val worker1 = Worker(name = "John", surname = "Kowalski", experience = 10, salary = 7000)
    val worker2 = Worker(name = "Adam", surname = "Kowalski", experience = 2, salary = 4000)
    val worker3 = Worker(name = "Michael", surname = "Smith", experience = 15, salary = 20000)
    val worker4 = Worker(name = "Nick", surname = "Anderson", experience = 13, salary = 10000)

//    obiekt klasy Manager
    val manager = Manager()

//    dodanie obiektu worker1 do ArrayList o nazwie workerList za pomocą metody zawartej w klasie Manager
    manager.addWorker(worker1)

//    Usunięcie obietku worker1 do ArrayList o nazwie workerList za pomocą metody zawartej w klasie Manager
    manager.removeWorker(worker1)

//    utworzenie listy workerList zawierającej wszystkie obiekty worker
    val workerList = listOf(worker1, worker2, worker3, worker4)

//    dodanie elementów workerList do ArrayList workersList znajdującej się w klasie Manager
    manager.addAllWorkers(workerList)

    manager.printWorkersData()

    val averageSalary = manager.getAverageSalary()
    println("Średnie zarobki w firmie wynoszą: $averageSalary")






}