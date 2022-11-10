
// POJO (Plain Old Java Object) - są to klasy, które nie mają swoich specjalnych zachowań, są tylko kontenerem na dane.
//Obiekty POJO (Plain Old Java Object) to nic innego jak zwykłe klasy zawierające jedynie pola,
// domyślny konstruktor (czyli taki, którego nie implementujemy, domyślnie jest tworzony przez kompilator)
// i akcesory (gettery i settery do każdego z pól). Nie mają one zbytnio żadnych zachowań, nic nie robią,
// po prostu pomagają nam organizować wszystkie informacje.

/*
Data class są to właśnie takie POJO, czyli klasy dedykowane specjalnie pod to, że będą tylo i wyłącznie trzymać dane
 */
data class ClientData(val name: String, val surname: String,){
    var id = 1
}
//porównując do normalnej klasy zawierającej takie same propercje:
class  Client(val name: String, val surname: String)

fun main(args: Array<String>) {

    val client = Client("John", "Smith")
    val clientData = ClientData("John", "Smitch")

//    Data class ma domyślnie nadpisaną metodę toString tak, aby wypisywać, to co się w klasie znajduje:
    println(clientData.toString())
//    Ta metoda (zmieniona to string) działa tylko ze wszystkimi parametrami konstruktora, ale nie działa w ciele klasy.

//    Dla poróznania wypisanie ze zwykłej klasy:
    println(client.toString())

//    porównanie dwuch obiektów ClientData ze zmienioną propercją id. :
    val clienData1 = ClientData("John", "Smith")
    val clienData2 = ClientData("John", "Smith")
    clienData2.id = 2

    if(clienData1.equals(clientData)){
        println("clientData1 i clientData2 są takie same")
    }

//    Wniosek jest taki, że wszystkie propercje powinny być zawarte w konstruktorze, inaczej mogą one nie być brane
//    pod uwagę.

}