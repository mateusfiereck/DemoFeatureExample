package br.com.mateusfiereck.character.di

import br.com.mateusfiereck.character.data.network.CharacterService
import br.com.mateusfiereck.character.data.repository.CharacterRepositoryImpl
import br.com.mateusfiereck.character.domain.repository.CharacterRepository
import br.com.mateusfiereck.character.navigation.CharacterNavigationImpl
import br.com.mateusfiereck.character.presentation.list.CharacterListViewModel
import br.com.mateusfiereck.navigation.CharacterNavigation
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val characterModule = module {
    // data
    factory { get<Retrofit>().create(CharacterService::class.java) }
    factory<CharacterRepository> { CharacterRepositoryImpl(get()) }

    // presentation
    viewModel { CharacterListViewModel(get()) }
    factory<CharacterNavigation> { CharacterNavigationImpl() }
}
