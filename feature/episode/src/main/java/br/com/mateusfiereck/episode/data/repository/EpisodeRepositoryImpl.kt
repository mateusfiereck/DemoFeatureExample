package br.com.mateusfiereck.episode.data.repository

import br.com.mateusfiereck.episode.data.network.EpisodeService
import br.com.mateusfiereck.episode.domain.model.EpisodeModel
import br.com.mateusfiereck.episode.domain.repository.EpisodeRepository
import io.reactivex.rxjava3.core.Observable

class EpisodeRepositoryImpl(
    private val episodeService: EpisodeService
) : EpisodeRepository {

    override fun getEpisodes(): Observable<List<EpisodeModel>> {
        return episodeService.getEpisodes().map { apiResponse ->
            apiResponse.results.map {
                EpisodeModel(id = it.id, name = it.name, air_date = it.air_date, episode = it.episode)
            }
        }
    }
}
