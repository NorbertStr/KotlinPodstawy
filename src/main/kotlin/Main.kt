import Models.character_model.Character
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Path

interface RickAndMortyApi{
    @GET("character/{id}")
    fun getCharacter(@Path("id") id: String): Call<Character>
}

object RickAndMortyService{
    private val service = Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getApi() = service.create(RickAndMortyApi::class.java)

}

fun main(args: Array<String>) {

    val api = RickAndMortyService.getApi()
    val response = api.getCharacter("2").execute()
    println(response.body()?.name)

}