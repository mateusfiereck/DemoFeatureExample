package br.com.mateusfiereck.character.domain.repository

import br.com.mateusfiereck.character.domain.model.CharacterModel
import io.reactivex.rxjava3.core.Observable

interface CharacterRepository {

    fun getCharacters(): Observable<List<CharacterModel>>
}