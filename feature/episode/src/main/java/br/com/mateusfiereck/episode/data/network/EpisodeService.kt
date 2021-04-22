package br.com.mateusfiereck.episode.data.network

import br.com.mateusfiereck.episode.data.network.response.ApiResponse
import retrofit2.http.GET
import io.reactivex.rxjava3.core.Observable

interface EpisodeService {

    @GET("episode")
    fun getEpisodes(): Observable<ApiResponse>
}
