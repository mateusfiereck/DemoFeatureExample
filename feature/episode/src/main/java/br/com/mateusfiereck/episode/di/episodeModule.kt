package br.com.mateusfiereck.episode.di

import br.com.mateusfiereck.episode.data.network.EpisodeService
import br.com.mateusfiereck.episode.data.repository.EpisodeRepositoryImpl
import br.com.mateusfiereck.episode.domain.repository.EpisodeRepository
import br.com.mateusfiereck.episode.navigation.EpisodeNavigationImpl
import br.com.mateusfiereck.episode.presentation.list.EpisodeListViewModel
import br.com.mateusfiereck.navigation.EpisodeNavigation
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val episodeModule = module {
    // data
    factory { get<Retrofit>().create(EpisodeService::class.java) }
    factory<EpisodeRepository> { EpisodeRepositoryImpl(get()) }

    // presentation
    viewModel { EpisodeListViewModel(get()) }
    factory<EpisodeNavigation> { EpisodeNavigationImpl() }
}
