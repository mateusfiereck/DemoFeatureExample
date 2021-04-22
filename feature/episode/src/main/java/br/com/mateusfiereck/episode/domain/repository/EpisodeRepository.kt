package br.com.mateusfiereck.episode.domain.repository

import br.com.mateusfiereck.episode.domain.model.EpisodeModel
import io.reactivex.rxjava3.core.Observable

interface EpisodeRepository {

    fun getEpisodes(): Observable<List<EpisodeModel>>
}
