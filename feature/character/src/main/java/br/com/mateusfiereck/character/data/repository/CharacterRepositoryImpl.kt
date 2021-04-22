package br.com.mateusfiereck.character.data.repository

import br.com.mateusfiereck.character.data.network.CharacterService
import br.com.mateusfiereck.character.domain.model.CharacterModel
import br.com.mateusfiereck.character.domain.repository.CharacterRepository
import io.reactivex.rxjava3.core.Observable

class CharacterRepositoryImpl(
    private val characterService: CharacterService
) : CharacterRepository {

    override fun getCharacters(): Observable<List<CharacterModel>> {
        return characterService.getCharacters().map { apiResponse ->
            apiResponse.results.map {
                CharacterModel(id = it.id, name = it.name, status = it.status, species = it.species)
            }
        }
    }
}
