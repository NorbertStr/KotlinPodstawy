
sealed class Response{
    class Success(val data: String): Response()
    class Failure(val errorCode: Int): Response()
    class Loading(val isLoading: Boolean): Response()

}

fun main(args: Array<String>) {


}