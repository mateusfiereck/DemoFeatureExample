package br.com.mateusfiereck.character.data.network

import br.com.mateusfiereck.character.data.network.response.ApiResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface CharacterService {

    @GET("character")
    fun getCharacters(): Observable<ApiResponse>
}
